package org.stacks.arrayimplementation;

public class Main {
    public static void main(String[] args){
        Stack stack = new Stack(4);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        boolean is_full = stack.isFull();
        System.out.println("stack is  full? : " + is_full);

        boolean is_empty = stack.isEmpty();
        System.out.println("stack is  empty? : " + is_empty);

        int top = stack.pop();
        System.out.println("top value is : " + top);
        top = stack.pop();
        System.out.println("top value is : " + top);

        int peek = stack.peek();
        System.out.println("Peeked top value is : " + peek);
    }
}
