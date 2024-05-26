package org.linkedlist;

import javax.swing.plaf.synth.SynthTextAreaUI;

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

    public void traverse(){
        Node node = head;
        if(head ==null){
            System.out.println(" CSLL doesn't exist.");
            return;
        }
        for(int index=0; index<size; index++){
            System.out.print(node.value);
            if(index < size-1){
                System.out.print(" --> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public boolean search(int valueToSearch){
        if (head ==null){
            System.out.println("CSLL is empty so this value doesn't exist in it.");
            return false;
        }
        Node node = head;
        int index = 0;
        while(index < size){
            if(valueToSearch==node.value){
                System.out.println("Found Node at location : " + index);
                return true;
            }
            node=node.next;
            index++;
        }
        System.out.println("Node not found");
        return false;
    }

    public void deleteNode(int location){
        if(head ==null){
            System.out.println("the CSLL doesn't exist.");
            return;
        }else if(location ==0){
            if(size == 1){
                head.next = null;
                head = null;
                tail = null;
            } else{
                head = head.next;
                tail.next = head;
            }
        } else if(location >= size){
            if(size ==1){
                head.next = null;
                head = null;
                tail = null;
            }else{
                Node tempNode = head;
                for(int i =0; i< size-1; i++){
                    tempNode = tempNode.next;
                }
                tempNode.next = head;
                tail = tempNode;
            }
        }else{
            Node tempNode = head;
            for(int i=0; i<location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
        }
        size--;
    }

}
