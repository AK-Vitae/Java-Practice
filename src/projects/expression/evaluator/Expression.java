package projects.expression.evaluator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Expression {

    /**
     * Expression to be evaluated
     */
    String expr;

    /**
     * Scalar symbols in the expression
     */
    ArrayList<ScalarSymbol> scalars;

    /**
     * Array symbols in the expression
     */
    ArrayList<ArraySymbol> arrays;

    /**
     * String containing all delimiters (characters other than variables and constants),
     * to be used with StringTokenizer
     */
    public static final String delims = " \t*+-/()[]";

    /**
     * Initializes this Expression object with an input expression. Sets all other
     * fields to null.
     *
     * @param expr Expression
     */
    public Expression(String expr) {
        this.expr = expr;
    }

    /**
     * Populates the scalars and arrays lists with symbols for scalar and array
     * variables in the expression. For every variable, a SINGLE symbol is created and stored,
     * even if it appears more than once in the expression.
     * At this time, values for all variables are set to
     * zero - they will be loaded from a file in the loadSymbolValues method.
     */
    public void buildSymbols() {
        expr = expr.replaceAll("\\s+", "");
        arrays = new ArrayList<>();
        scalars = new ArrayList<>();
        String[] tokens = expr.split("(?<=[\\[\\]()\\-+*/])|(?=[]()\\-+*/])");
        for (String token : tokens) {
            if (Character.isLetter(token.charAt(0))) {
                if (token.charAt(token.length() - 1) == '[') {
                    arrays.add(new ArraySymbol(token.substring(0, token.length() - 1)));
                } else {
                    scalars.add(new ScalarSymbol(token));
                }
            }
        }
//        printScalars();
//        printArrays();
    }

    /**
     * Loads values for symbols in the expression
     *
     * @param sc Scanner for values input
     * @throws IOException If there is a problem with the input
     */
    public void loadSymbolValues(Scanner sc)
            throws IOException {
        while (sc.hasNextLine()) {
            StringTokenizer st = new StringTokenizer(sc.nextLine().trim());
            int numTokens = st.countTokens();
            String sym = st.nextToken();
            ScalarSymbol ssymbol = new ScalarSymbol(sym);
            ArraySymbol asymbol = new ArraySymbol(sym);
            int ssi = scalars.indexOf(ssymbol);
            int asi = arrays.indexOf(asymbol);
            if (ssi == -1 && asi == -1) {
                continue;
            }
            int num = Integer.parseInt(st.nextToken());
            if (numTokens == 2) { // scalar symbol
                scalars.get(ssi).value = num;
            } else { // array symbol
                asymbol = arrays.get(asi);
                asymbol.values = new int[num];
                // following are (index,val) pairs
                while (st.hasMoreTokens()) {
                    String tok = st.nextToken();
                    StringTokenizer stt = new StringTokenizer(tok, " (,)");
                    int index = Integer.parseInt(stt.nextToken());
                    int val = Integer.parseInt(stt.nextToken());
                    asymbol.values[index] = val;
                }
            }
        }
    }


    /**
     * Evaluates the expression, using RECURSION to evaluate subexpressions and to evaluate array
     * subscript expressions.
     *
     * @return Result of evaluation
     */
    public float evaluate() {
        return evaluate(expr);
    }

    /**
     * Recursive implementation
     * Operators and Numbers are managed through stacks
     */
    private float evaluate(String expression) {
        if (expression == null || expression.length() == 0) {
            return 0; // Empty Expression
        }

        expression = expression.replaceAll("\\s+", ""); // Remove Whitespace
        this.expr = expression;
        Stack<Float> numbers = new Stack<Float>();
        Stack<String> operators = new Stack<String>();
        String[] tokens;

        // Create variables to be used in bracket tracking
        int openBracket;
        int closedBracket = 0;
        int open = 0;
        int close = 0;
        String modExpr;
        String temp;
        int count;

        // Search for "[" and, if found, run evaluate recursively to solve subexpression
        for (int i = 0; i < expr.length(); i++) {
            if (expr.charAt(i) == '[') {
                openBracket = i;
                i++;
                for (; i < expr.length(); i++) {
                    if (expr.charAt(i) == ']') {
                        close++;
                    }
                    if (expr.charAt(i) == '[') {
                        open++;
                    }
                    if (expr.charAt(i) == ']' && open < close) {
                        closedBracket = i;
                        open = 0;
                        close = 0;
                        break;
                    }
                }
                modExpr = expr;
                expr = expr.substring(openBracket + 1, closedBracket);
                temp = modExpr.substring(openBracket, closedBracket + 1);
                count = temp.length();
                temp = "" + (int) evaluate();
                expr = modExpr.substring(0, openBracket + 1) + temp + modExpr.substring(closedBracket);
                i -= count - temp.length();
            }
        }

        // Search for "(" and, if found, run evaluate recursively to solve subexpression
        for (int i = 0; i < expr.length(); i++) {
            if (expr.charAt(i) == '(') {
                openBracket = i;
                i++;
                for (; i < expr.length(); i++) {
                    if (expr.charAt(i) == ')') {
                        close++;
                    }
                    if (expr.charAt(i) == '(') {
                        open++;
                    }
                    if (expr.charAt(i) == ')' && open < close) {
                        closedBracket = i;
                        open = 0;
                        close = 0;
                        break;
                    }
                }
                modExpr = expr;
                expr = expr.substring(openBracket + 1, closedBracket);
                temp = modExpr.substring(openBracket, closedBracket + 1);
                count = temp.length();
                float val = evaluate();
                temp = "" + val;
                expr = modExpr.substring(0, openBracket) + temp + modExpr.substring(closedBracket + 1);
                i -= count - temp.length();
            }
        }

        //Use String split to turn expression into individual tokens using custom delimiter
        tokens = expr.split("(?<=[\\[\\]()\\-+*/])|(?=[]()\\-+*/])");
        for (int i = 0; i < tokens.length; i++) {
            // If token is a Digit
            if (Character.isDigit(tokens[i].charAt(0))) {
                numbers.push(Float.parseFloat(tokens[i]));
                // If token is a variable
            } else if (Character.isLetter(tokens[i].charAt(0))) {
                // If token is an array name
                for (ArraySymbol array : arrays) {
                    if (tokens[i].contains("[") && tokens[i].substring(0, tokens[i].length() - 1).equals(array.name)) {
                        i++;
                        int pulledVal = Integer.parseInt(tokens[i]);
                        float value = (float) array.values[pulledVal];
                        numbers.push(value);
                    }
                }
                // If token is an string name
                for (ScalarSymbol scalar : scalars) {
                    if (tokens[i].equals(scalar.name)) {
                        float value = (float) scalar.value;
                        numbers.push(value);
                        break;
                    }
                }
                // If token is an operator
            } else if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                // Do nothing if token is a "-" operator and if the preceding and following tokens are digits
                if (tokens[i].equals("-") && Character.isDigit(tokens[i - 1].charAt(0)) && Character.isDigit(tokens[i + 1].charAt(0))) {
                    // Handling Negative Values: if token is a "-" operator, the preceding token is an operator, and the following term is a digit, push negative value into numbers stack
                } else if (tokens[i].equals("-") && (tokens[i - 1].equals("+") || tokens[i - 1].equals("-") || tokens[i - 1].equals("*") || tokens[i - 1].equals("/")) && Character.isDigit(tokens[i + 1].charAt(0))) {
                    numbers.push(Float.parseFloat(tokens[i + 1]) * (float) -1.0);
                    i += 2;
                    continue;
                }
                // Solve Expression up to current point using order of operations
                while (!operators.isEmpty() && this.orderOfOperations(tokens[i], operators.peek())) {
                    numbers.push(solve(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.push(tokens[i]);
            }
        }
        // Solve final expression
        while (!operators.isEmpty()) {
            numbers.push(solve(operators.pop(), numbers.pop(), numbers.pop()));
        }
        return numbers.pop();
    }

    // Order of operations: "*" and "/" have higher priority than "+" and "-"
    private boolean orderOfOperations(String op1, String op2) {
        return (!op1.equals("*") && !op1.equals("/")) || (!op2.equals("+") && !op2.equals("-"));
    }

    // Mathematical Calculations
    public float solve(String op, float right, float left) {
        switch (op) {
            case "+" -> {
                System.out.println(left + "+" + right);
                return left + right;
            }
            case "-" -> {
                System.out.println(left + "-" + right);
                return left - right;
            }
            case "*" -> {
                System.out.println(left + "*" + right);
                return left * right;
            }
            case "/" -> {
                System.out.println(left + "/" + right);
                if (right == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return left / right;
            }
        }
        return 0;
    }

    /**
     * Utility method, prints the symbols in the scalars list
     */
    public void printScalars() {
        for (ScalarSymbol ss : scalars) {
            System.out.println(ss);
        }
    }

    /**
     * Utility method, prints the symbols in the arrays list
     */
    public void printArrays() {
        for (ArraySymbol as : arrays) {
            System.out.println(as);
        }
    }

}