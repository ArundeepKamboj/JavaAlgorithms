package org.stacks.linkedlistimplementation;

import org.linkedlist.SinglyLinkedList;

public class Stack {
    SinglyLinkedList linkedlist;

    public Stack(){
        linkedlist = new SinglyLinkedList();
    }

    //push
    public void push(int value){
        linkedlist.insert(value, 0);
        System.out.println("Inserted " + value + " in Stack");
    }

    //isEmpty
    public boolean isEmpty(){
        if(linkedlist.head == null){
            return true;
        }
        return false;
    }

    //pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        int top = linkedlist.head.value;
        linkedlist.delete(0);
        return top;
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        return linkedlist.head.value;
    }

    //delete Stack
    public void deleteStack(){
        linkedlist.head = null;
        System.out.println("Stack is deleted.");
    }
}
