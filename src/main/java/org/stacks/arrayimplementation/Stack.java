package org.stacks.arrayimplementation;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack= -1;
        System.out.println("the stack is created with size : " + size);
    }

    // is empty
    public boolean isEmpty(){
        if(topOfStack==-1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if( topOfStack == arr.length-1){
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }
}
