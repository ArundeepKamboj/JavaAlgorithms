package org.linkedlist;

public class CircularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    DoublyNode createCDLL(int nodeValue){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head= newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }

    public void insertCDLL(int nodeValue, int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if(head == null){
            createCDLL(nodeValue);
            return;
        } else if(location == 0){
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else{
            DoublyNode tempNode = head;
            int index = 0;
            while(index < location -1){
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            newNode.next.prev = newNode;
            tempNode.next = newNode;
        }
        size++;
    }

    public void traverseCDLL(){
        if(head != null){
            DoublyNode tempNode = head;
            for(int index=0; index<size; index++){
                System.out.print(tempNode.value);
                if(index != size-1){
                    System.out.print(" <--> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println(" ");
        } else{
            System.out.println("CDLL doesn't exist");
        }
    }

    public void reverseTraversalCDLL(){
        if(head != null){
            DoublyNode tempNode = tail;
            for(int index = 0; index<size; index++){
                System.out.print(tempNode.value);
                if (index != size-1){
                    System.out.print( " <--> ");
                }
                tempNode = tempNode.prev;
            }
            System.out.println(" ");
        } else{
            System.out.println("CDLL doesn't exist");
        }
    }

    public boolean searchCDLL(int value){
        if(head != null){
            DoublyNode tempNode = head;
            for(int index = 0; index < size; index++){
                if(tempNode.value == value){
                    System.out.println("Value is found at index " + index );
                    return true;
                }
                tempNode = tempNode.next;
            }
            System.out.println("Node not found in CDLL");
        } else{
            System.out.println("DLL doesn't exist.");
        }
        return false;
    }

    public void deleteNode(int location){
        if (head != null){
            DoublyNode tempNode;
            if(location == 0){
                if(size ==1){
                    head.prev = null;
                    head.next = null;
                    head = null;
                    tail = null;
                } else{
                    tempNode = head;
                    head = tempNode.next;
                    head.prev = tail;
                    tail.next = head;
                }
            } else if (location >=size-1) {
                if(size ==1){
                    head.prev = null;
                    head.next = null;
                    head = null;
                    tail = null;
                } else{
                    tempNode = tail;
                    tail = tempNode.prev;
                    tail.next = head;
                    head.prev = tail;
                }
            } else{
                tempNode = head;
                for(int index =0; index<location-1; index++){
                    tempNode = tempNode.next;
                }
                tempNode.next= tempNode.next.next;
                tempNode.next.prev = tempNode;
            }
            size--;
        } else{
            System.out.println("CDLL doesn't exist.");
        }
    }

    public void deleteCDLL(){
        if(head != null){
            DoublyNode tempNode = head;
            for(int i=0; i<size; i++){
                tempNode.prev = null;
                tempNode = tempNode.next;
            }
            head = null;
            tail = null;
            size = 0;
            System.out.println("CDLL has been deleted.");
        } else{
            System.out.println("CDLL doesn't exist.");
        }
    }
}
