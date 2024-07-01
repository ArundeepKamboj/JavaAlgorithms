package org.linkedlist.questions;

import java.util.HashSet;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createLL(int nodeValue){
        Node newNode = new Node();
        newNode.value= nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNode(int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        if(head != null){
            tail.next=newNode;
            tail= newNode;
            size++;
        } else{
            createLL(nodeValue);
        }
    }

    public void traversalLL(){
        Node tempNode = head;
        for(int i =0; i<size; i++){
            System.out.print(tempNode.value);
            if(i != size-1){
                System.out.print(" --> ");
            }
            tempNode=tempNode.next;
        }
        System.out.println("\n");
    }

    public void removeDups(){
        HashSet<Integer> hashset = new HashSet<Integer>();
        Node current = head;
        Node prev = null;
        while(current != null){
            if(hashset.contains(current.value)){
                prev.next = current.next;
                size = size-1;
                if (current==tail){
                    tail = prev;
                }
                current = current.next;
            } else{
                hashset.add(current.value);
                prev = current;
                current = current.next;
            }
        }
    }

    // nth to last
    public Node nthToLast(int n){
        Node p1 = head;
        Node p2 = head;
        for(int i =1; i < n; i++){
            if(p2 ==null){
                return null;
            }
            p2 = p2.next;
        }
        while(p2.next!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

}
