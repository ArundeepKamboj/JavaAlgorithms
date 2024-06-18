package org.linkedlist;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createDLL(int nodeValue){
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    //insert a node
    public void insertDLL(int nodeValue, int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head==null){
            createDLL(nodeValue);
            return;
        } else if(location==0){
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else{
            DoublyNode tempNode = head;
            for(int i =0; i< location-1; i++){
                tempNode = tempNode.next;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    public void trverseDLL(){
        if (head !=null){
            DoublyNode tempNode = head;
            while(tempNode.next !=null){
                System.out.print(tempNode.value);
                System.out.print(" <==> ");
                tempNode=tempNode.next;
            }
            System.out.println(tempNode.value);
        } else{
            System.out.println("DLL doesn't exist");
        }
    }

    public void reversetraverseDLL(){
        if(tail != null){
            DoublyNode tempNode = tail;
            while(tempNode.prev != null){
                System.out.print(tempNode.value);
                System.out.print(" <==> ");
                tempNode=tempNode.prev;
            }
            System.out.println(tempNode.value);
        } else{
            System.out.println("DLL doesn't exist");
        }
    }

    // search
    public boolean searchNode(int nodeValue){
        if (head != null){
            DoublyNode tempNode = head;
            while(tempNode!= null){
                if (tempNode.value == nodeValue){
                    System.out.println("Found the value");
                    return true;
                }
                tempNode=tempNode.next;
            }
            System.out.println("Node not found");
        } else{
            System.out.println("DLL doesn't exist so value is not present.");
        }
        return false;
    }

    //delete a node
    public void deleteDLL(int location){
        if(head ==null){
            System.out.println("DLL doesn't exist");
        } else{
            if (size ==1 && location >=0){
                head = null;
                tail = null;
            } else if(location < size-1){
                DoublyNode tempNode = head;
                for(int i = 0; i< location-1; i++){
                    tempNode = tempNode.next;
                }
                if (location ==0){
                    head = tempNode.next;
                    head.prev = null;
                } else{
                    tempNode.next = tempNode.next.next;
                    tempNode.next.prev = tempNode;
                }
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }
    }

}
