package org.queue.circulararrayimplementation;

public class CircularQueue {
    int[] arr;
    int beginingOfQueue;
    int topOfQueue;
    int size;

    public CircularQueue(int size){
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue=-1;
        this.beginingOfQueue = -1;
        System.out.println("The Circular queue is successfully created with size of " + this.size);
    }

    //isEmpty
    public boolean isEmpty(){
        if(topOfQueue==-1){
            return true;
        }
        else {
            return false;
        }
    }

    //is Full
    public boolean isFull(){
        if(topOfQueue + 1 == beginingOfQueue){
            return true;
        } else if(topOfQueue==arr.length-1 && beginingOfQueue==0){
            return true;
        } else{
            return false;
        }
    }

    //Enqueue
    public void enQueue(int value){
        if (isFull()){
            System.out.println("The queue if already full, so will not be able to insert this value.");
        } else if (isEmpty()) {
            arr[0] = value;
            topOfQueue=0;
            beginingOfQueue=0;
            System.out.println("The value has been successfully inserted to the queue.");
        } else{
            if(topOfQueue==arr.length-1){
                topOfQueue=0;
            } else{
                topOfQueue++;
            }
            arr[topOfQueue]=value;
            System.out.println("The value has been successfully inserted to the queue.");
        }
    }
}
