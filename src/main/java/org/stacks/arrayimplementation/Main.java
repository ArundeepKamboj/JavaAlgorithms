package org.stacks.arrayimplementation;

public class Main {
    public static void main(String[] args){
        Stack stack = new Stack(4);
        boolean is_empty = stack.isEmpty();
        System.out.println("stack is  empty? : " + is_empty);

        boolean is_full = stack.isFull();
        System.out.println("stack is  full? : " + is_full);


    }
}
