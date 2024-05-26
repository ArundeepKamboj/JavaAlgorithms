package org.linkedlist;

public class CircularSinglyLinkedListMain {
    public static void main(String[] args){
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        csll.createCSLL(5);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);
    }
}
