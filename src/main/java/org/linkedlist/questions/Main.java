package org.linkedlist.questions;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.insertNode(3);
        ll.insertNode(4);
        ll.insertNode(5);
        ll.insertNode(6);
        ll.insertNode(1);
        ll.insertNode(6);
        ll.insertNode(1);
        ll.insertNode(1);
        ll.traversalLL();

        Node node = ll.nthToLast(3);
        System.out.println("Value of 3 node from last is: " + node.value);

        ll.removeDups();
        ll.traversalLL();

    }


}
