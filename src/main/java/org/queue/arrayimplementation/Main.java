package org.queue.arrayimplementation;

public class Main {
    public static void main(String[] args){
        QueueArray queue = new QueueArray(5);
        boolean isFull = queue.isFull();
        System.out.println(isFull);
        boolean isEmpty = queue.isEmpty();
        System.out.println(isEmpty);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        isFull = queue.isFull();
        System.out.println(isFull);
        isEmpty = queue.isEmpty();
        System.out.println(isEmpty);

        int dequeue = queue.deQueue();
        System.out.println("value dequeued is : " + dequeue);
        int peek = queue.peek();
        System.out.println("peek dequeued is : " + peek);

        dequeue = queue.deQueue();
        System.out.println("value dequeued is : " + dequeue);
        dequeue = queue.deQueue();
        System.out.println("value dequeued is : " + dequeue);
        dequeue = queue.deQueue();
        System.out.println("value dequeued is : " + dequeue);
        dequeue = queue.deQueue();
        System.out.println("value dequeued is : " + dequeue);

        queue.deleteQueue();
    }
}
