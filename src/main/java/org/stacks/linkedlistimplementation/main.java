package org.stacks.linkedlistimplementation;

public class main {
    public static void main(String[] args){
        Stack stack = new Stack();
        boolean is_empty = stack.isEmpty();
        System.out.println("IS Stack empty? " + is_empty);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        is_empty = stack.isEmpty();
        System.out.println("IS Stack empty? " + is_empty);
        System.out.println("Top value of Stack is : " + stack.pop());

        System.out.println("Peek value of Stack is : " + stack.peek());

        stack.deleteStack();

        Stack1 stack1 = new Stack1(1);
        stack1.push(2);
        System.out.println("Value at top is : " + stack1.top.value);
        System.out.println("Pop value is : " + stack1.pop());
    }
}
