package org.queue.linkedlistimplementation;

public class Main {

    public static void main(String[] args){
        QueueLinkedList qll = new QueueLinkedList();
        boolean isempty = qll.isEmpty();
        System.out.println("the queue is empty? : " + isempty);

        qll.enQueue(1);
        qll.enQueue(2);
        qll.enQueue(3);
        qll.enQueue(4);
        qll.enQueue(5);

        int peek = qll.peek();
        System.out.println("the value peeked is : " + peek);
        int deQueue = qll.deQueue();
        System.out.println("the value dequeued is : " + deQueue);
        deQueue = qll.deQueue();
        System.out.println("the value dequeued is : " + deQueue);
        deQueue = qll.deQueue();
        System.out.println("the value dequeued is : " + deQueue);
        deQueue = qll.deQueue();
        System.out.println("the value dequeued is : " + deQueue);
        deQueue = qll.deQueue();
        System.out.println("the value dequeued is : " + deQueue);
        deQueue = qll.deQueue();
        System.out.println("the value dequeued is : " + deQueue);
        deQueue = qll.deQueue();
        System.out.println("the value dequeued is : " + deQueue);
    }
}
