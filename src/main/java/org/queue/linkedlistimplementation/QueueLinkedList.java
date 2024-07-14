package org.queue.linkedlistimplementation;

import org.linkedlist.SinglyLinkedList;

public class QueueLinkedList {
    SinglyLinkedList list;

    public QueueLinkedList(){
        list = new SinglyLinkedList();
        System.out.println("The queue is successfully created.");
    }

    //is Empty
    public boolean isEmpty(){
        if(list.head==null){
            return true;
        }
        return false;
    }

    //enqueue
    public void enQueue(int value){
        list.insert(value,list.size+1);
        System.out.println("The value is successfully inserted.");
    }

    public int deQueue(){
        int result = -1;
        if(isEmpty()){
            System.out.println("The queue is empty.");
        } else{
            result = list.head.value;
            list.delete(0);
        }
        return result;
    }

    public int peek(){
        int result = -1;
        if(isEmpty()){
            System.out.println("The queue is empty.");
        } else{
            result = list.head.value;
        }
        return result;
    }

    public void deleteQueue(){
        list.head = null;
        list.tail = null;
        System.out.println("the queue has been successfully deleted.");
    }
}
