package org.stacks.linkedlistimplementation;

public class Stack1 {
    public class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    public Node top;
    public int height;

    Stack1(int initialValue){
        this.top = new Node(initialValue);
        this.height = 1;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        height++;
    }

    public int pop(){
        int result = -1;
        if(height != 0){
            result = top.value;
            top = top.next;
            height--;
        }
        return result;
    }
}
