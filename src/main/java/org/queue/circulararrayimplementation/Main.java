package org.queue.circulararrayimplementation;

public class Main {
    public static void main(String[] args){
        CircularQueue circularQueue = new CircularQueue(5);
        boolean isEmpty = circularQueue.isEmpty();
        System.out.println("The Queue is Empty? : " + isEmpty);
        circularQueue.enQueue(1);
        circularQueue.enQueue(2);
        circularQueue.enQueue(3);
        circularQueue.enQueue(4);
        circularQueue.enQueue(5);

        boolean isFull = circularQueue.isFull();
        System.out.println("The Queue is Full? : " + isFull);
        circularQueue.enQueue(6);

        int deQueue = circularQueue.deQueue();
        System.out.println("Value dequeued is : " + deQueue);
        deQueue = circularQueue.deQueue();
        System.out.println("Value dequeued is : " + deQueue);
        deQueue = circularQueue.deQueue();
        System.out.println("Value dequeued is : " + deQueue);
        circularQueue.enQueue(6);
        circularQueue.enQueue(7);

        int peek = circularQueue.peek();
        System.out.println("Value Peeked is : " + peek);
        deQueue = circularQueue.deQueue();
        System.out.println("Value dequeued is : " + deQueue);
        deQueue = circularQueue.deQueue();
        System.out.println("Value dequeued is : " + deQueue);
        deQueue = circularQueue.deQueue();
        System.out.println("Value dequeued is : " + deQueue);
        deQueue = circularQueue.deQueue();
        System.out.println("Value dequeued is : " + deQueue);
        deQueue = circularQueue.deQueue();
        System.out.println("Value dequeued is : " + deQueue);

        circularQueue.deleteQUeue();
    }
}
