package org.linkedlist;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next=null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    //Insert method for SIngly Linked List
    public void insert(int nodeValue, int location){
        Node newNode = new Node();
        newNode.value = nodeValue;
        if(head==null){
            this.createSinglyLinkedList(nodeValue);
            return;
        }else if(location==0){
            newNode.next = head;
            head=newNode;
        } else if(location>=size){
            tail.next = newNode;
            tail= newNode;
            newNode.next=null;
        } else{
            Node tempNode = head;
            int index = 0;
            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            newNode.next = tempNode.next;
            tempNode.next= newNode;
        }
        size++;
    }

    void traverseSinglyLinkedList(){
        if(this.head==null){
            System.out.println("SLL doesn't exist");
        } else{
            Node tempNode=this.head;
            while(tempNode.next != null){
                System.out.print(tempNode.value + " -> ");
                tempNode=tempNode.next;
            }
            System.out.println(tempNode.value);
        }
    }
}
