package datastructures.stacks;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class StackUsingArrayList<T> {
    private ArrayList<T> list;

    public StackUsingArrayList() {
        list = new ArrayList<T>();
    }

    public void push(T v){
        list.add(v);
    }

    public T peek(){
        return list.get(list.size()-1); // Index starts at 0, and last element is at the top of the stack
    }

    public T pop() throws NoSuchElementException {
        if (list.size() == 0){
            throw new NoSuchElementException();
        }
        return list.remove(list.size()-1);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }

    public static void main(String[] args) {
        StackUsingArrayList<String> stack = new StackUsingArrayList<>();
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
