# Overview: Expression Evaluation

The purpose of this project is to create a program that will evaluate mathematical expressions.

Here are some sample expressions that this program will evaluate:

- 3

- Xyz

- 3-4*5

- a-(b+A[B[2]])*d+3

- A[2*(a+b)]

- (varx + vary*varz[(vara+varb[(a+b)*33])])/55

  

## Expression Restrictions

- Integer constants 

- Scalar (simple, non-array) variables with integer values 

- Arrays of integers, indexed with a constant or a subexpression 

- Addition, subtraction, multiplication, and division operators 

- Parenthesized subexpressions

  

## Additional Notes

- Subexpressions (including indexes into arrays between '[' and ']') may be nested to any level
- Multiplication and division have higher precedence than addition and subtraction
- Variable names (either scalars or arrays) will be made up of one or more letters ONLY (nothing but letters a-z and A-Z), are case sensitive (Xyz is different from xyz) and will be unique. 
- Integer constants may have multiple digits 
- There may any number of spaces or tabs between any pair of tokens in the expression. 
- Tokens are variable names, constants, parentheses, square brackets, and operators.



## Project Classes 

This project includes several classes. 

Following is a high level description of each class (more information available in the respective .java file):



**ScalarSymbol**: This class represents a simple variable with a single value.

**ArraySymbol**: This class represents an array of integer values.

**Expression** This class represents the expression as a whole, and consists all the following steps of the evaluation process: 

1. **buildSymbols** - This method populates the two instance fields, scalars and arrays, with all simple (scalar) variables, and all array variables, respectively, that appear in the expression.
2. **loadSymbolValues** - This method reads values for all scalars and arrays from a file, into the ScalarSymbol and ArraySymbol objects stored in the scalars and arrays array lists. 
3. **evaluate** - This method evaluates the expression. 
4. **printScalars** and **printArrays** may be used to verify the correctness of the scalars and arrays lists after the buildSymbols and loadSymbolValues methods.

**Evaluator**: The application driver, which calls methods in Expression.

**Stack**: This class is to be used in the evaluation process.