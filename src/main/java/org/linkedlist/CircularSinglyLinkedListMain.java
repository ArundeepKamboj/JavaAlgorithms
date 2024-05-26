package org.linkedlist;

public class CircularSinglyLinkedListMain {
    public static void main(String[] args){
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        csll.search(10);
        csll.createCSLL(5);
        csll.insert(4,0);
        csll.insert(1,8);
        csll.insert(2,2);
        csll.insert(9,3);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);

        csll.traverse();
        csll.search(10);
        csll.search(9);

        csll.deleteNode(0);
        csll.traverse();
        csll.deleteNode(10);
        csll.traverse();
        csll.deleteNode(1);
        csll.traverse();
    }
}
