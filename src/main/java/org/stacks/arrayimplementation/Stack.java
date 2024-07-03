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

    public void push(int value){
        if(isFull()){
            System.out.println("STack is full");
        } else{
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("Value is successfully inserted");
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("STack is empty so can't pop.");
            return -1;
        } else{
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        } else{
            return arr[topOfStack];
        }
    }

    // delete stack
    public void deleteStack(){
        arr=null;
        System.out.println("Stack is deleted.");
    }
}
