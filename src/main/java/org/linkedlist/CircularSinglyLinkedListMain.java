package org.linkedlist;

public class CircularSinglyLinkedListMain {
    public static void main(String[] args){
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        csll.createCSLL(5);
        csll.insert(4,0);
        csll.insert(1,8);
        csll.insert(2,2);
        csll.insert(5,3);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);
    }
}
