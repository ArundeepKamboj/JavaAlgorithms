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

    boolean search(int value){
        if(this.head != null){
            Node tempNode = head;
            boolean found = false;
            while(tempNode != null){
                if(tempNode.value ==value){
                    found = true;
                    System.out.println("Value found in SLL.");
                    break;
                }
                tempNode = tempNode.next;
            }
            if(!found){
                System.out.println("Value not found in SLL.");
            }
            return  found;
        }
        System.out.println("SLL is empty so value not found.");
        return false;
    }

    // delete from a given location.
    void delete(int location){
        if(this.head == null){
            System.out.println("SLL doesn't exist.");
        } else if (location==0) {
            if(this.size==1){
                this.head=null;
                this.tail=null;
                this.size=0;
            } else{
                this.head = this.head.next;
                size--;
            }
        } else if(location >=this.size){
            if(this.size ==1){
                this.head=null;
                this.tail=null;
                size=0;
            } else{
                Node tempNode = this.head;
                for(int i =0; i<this.size-2; i++){
                    tempNode=tempNode.next;
                }
                tempNode.next = null;
                this.tail = tempNode;
                this.size--;
            }
        } else{
            Node tempNode=this.head;
            while(location > 1){
                tempNode = tempNode.next;
                location--;
            }
            tempNode.next = tempNode.next.next;
            this.size--;
        }
    }

    //delete linked list
    void deleteSLL(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    //Rotate
    public String rotate(int number) {
        int index = number;
        if(this.size <=1){
            return "No Rotation";
        }
        if (index > this.size){
            index = index % this.size;
        }
        if(index > 0 && this.size > 1){
            this.tail.next = this.head;
            Node tempNode = this.head;
            while(index > 1){
                tempNode = tempNode.next;
                index--;
            }
            this.tail = tempNode;
            this.head = tempNode.next;
            tempNode.next = null;
        }
        return "Success";
    }
}
