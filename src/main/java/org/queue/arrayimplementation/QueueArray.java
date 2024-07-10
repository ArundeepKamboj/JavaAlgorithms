package org.queue.arrayimplementation;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginingOfQueue;

    public QueueArray(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginingOfQueue = -1;
        System.out.println("The Queue is successfully created with size : " + size);
    }

    public boolean isFull(){
        if(topOfQueue == arr.length-1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(beginingOfQueue == -1 || beginingOfQueue==arr.length){
            return true;
        }
        return false;
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("The queue is Full");
        } else if (isEmpty()){
            beginingOfQueue=0;
            topOfQueue=0;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        } else{
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
    }

    public int deQueue(){
        int result = -1;
        if(isEmpty()){
            System.out.println("The queue is Empty.");
        } else{
            result = arr[beginingOfQueue];
            arr[beginingOfQueue]=-1;
            beginingOfQueue++;
            if(beginingOfQueue>topOfQueue){
                beginingOfQueue = -1;
                topOfQueue = -1;
            }
        }
        return result;
    }

    public int peek(){
        int result = -1;
        if(isEmpty()){
            System.out.println("The queue is Empty.");
        } else{
            result = arr[beginingOfQueue];
        }
        return result;
    }

    public void deleteQueue(){
        arr = null;
        System.out.println("The queue is successfully deleted");
    }
}
