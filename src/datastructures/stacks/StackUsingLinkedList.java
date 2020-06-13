package datastructures.stacks;

import java.util.LinkedList;

public class StackUsingLinkedList<T> {
    private LinkedList<T> list = new LinkedList<T>();
    public void push(T v){
        list.addFirst(v);
    }

    public T peek(){
        return list.getFirst();
    }

    public T pop(){
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingLinkedList<String> stack = new StackUsingLinkedList<>();
        stack.push("the World");
        stack.push(" ");
        stack.push("to");
        stack.push(" ");
        stack.push("Welcome");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }


    }
}
