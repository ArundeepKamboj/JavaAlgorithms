package org.linkedlist;

public class DoublyLinkedListMain {

    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
//        dll.createDLL(1);
        dll.trverseDLL();
        dll.insertDLL(0,0);
        dll.insertDLL(2,2);
        dll.insertDLL(1,1);
        dll.insertDLL(4,4);
        dll.insertDLL(3,3);
        System.out.println(dll.head.value);
        System.out.println(dll.head.next.value);
        System.out.println(dll.head.next.next.value);
        System.out.println(dll.head.next.next.next.value);
        System.out.println(dll.head.next.next.next.next.value);

        dll.trverseDLL();
        dll.reversetraverseDLL();
    }
}
