package org.linkedlist;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue){
        Node node = new Node();
        node.value=nodeValue;
        node.next=node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insert(int nodeValue, int location){
        if(head==null){
            createCSLL(nodeValue);
            return;
        }
        Node node = new Node();
        node.value = nodeValue;
        if(location ==0 ){
            node.next = head;
            tail.next = node;
            head = node;
        } else if(location>=size){
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while(index<location-1){
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

}
