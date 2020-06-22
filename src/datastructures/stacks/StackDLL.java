package datastructures.stacks;

import datastructures.queues.oop.DLL;

public class StackDLL<T> {
    private DLL<T> myList;

    public StackDLL() {
        myList=new DLL<T>();
    }

    public void push(T element) {
        myList.addFirst(element);
    }

    public T pop() {
        T element=null;
        if (myList.size()>0) {
            element = myList.getFirst();
            myList.deleteFirst();
        }
        return element;
    }

    public boolean isEmpty() {
        return myList.size()==0;
    }

    public static void main(String[] args)
    {
        StackDLL<String> myStackDLL = new StackDLL<String>();
        String expression="(((7)*(5+3)-8)/3+9)*3)";
        for (int i=0;i<expression.length();i++) {
            if (expression.charAt(i)=='(') {
                myStackDLL.push("a");
            }
            else if (expression.charAt(i)==')') {
                if (!myStackDLL.isEmpty()) {
                    myStackDLL.pop();
                }
                else {
                    System.out.println("Mismatch");
                    return;
                }
            }
        }
        if (!myStackDLL.isEmpty()) {
            System.out.println("Mismatch");
        }
        System.out.println("Match");
    }
}
