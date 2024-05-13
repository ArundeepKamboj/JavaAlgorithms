package org.linkedlist;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(2);
        System.out.println(sll.head.value);
        System.out.println(sll.head.next);

        sll.insert(0,0);
        sll.insert(1,1);
        sll.insert(4,4);
        sll.insert(3,3);
        sll.insert(5,5);
        sll.insert(8,7);
        sll.insert(6,6);

        sll.traverseSinglyLinkedList();

    }
}
