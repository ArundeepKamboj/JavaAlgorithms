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
        sll.search(5);
        sll.search(10);

        sll.delete(3);
        sll.delete(3);
        sll.traverseSinglyLinkedList();
        sll.delete(100);
        sll.traverseSinglyLinkedList();
        sll.delete(0);
        sll.traverseSinglyLinkedList();

        sll.deleteSLL();
        sll.traverseSinglyLinkedList();
    }
}
