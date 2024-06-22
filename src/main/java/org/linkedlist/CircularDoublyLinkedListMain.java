package org.linkedlist;

public class CircularDoublyLinkedListMain {

    public static void main(String[] args){
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
//        cdll.createCDLL(1);
        cdll.insertCDLL(1,10);
        System.out.println(cdll.head.value);
        cdll.insertCDLL(0,0);
        cdll.insertCDLL(5,5);
        cdll.insertCDLL(2,2);
        cdll.insertCDLL(3,3);
        cdll.insertCDLL(4,4);
        System.out.println(cdll.tail.value);

        cdll.traverseCDLL();
        cdll.reverseTraversalCDLL();
        cdll.searchCDLL(10);
        cdll.searchCDLL(4);
        System.out.println("Size of CDLL is : " + cdll.size);
        cdll.deleteNode(10);
        System.out.println("Size of CDLL is : " + cdll.size);
        cdll.traverseCDLL();
        cdll.deleteCDLL();
        cdll.traverseCDLL();
    }
}
