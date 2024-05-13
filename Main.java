package com.labQ3;

public class Main {
	    public static void main(String[] args) {
	        QueueUsingTwoStacks queue = new QueueUsingTwoStacks(5);

	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);

	        System.out.println("Peek: " + queue.peek());

	        System.out.println("Dequeue: " + queue.dequeue()); 
	        System.out.println("Dequeue: " + queue.dequeue()); 

	        queue.enqueue(4);
	        queue.enqueue(5);

	        System.out.println("Peek: " + queue.peek()); 

	        System.out.println("Dequeue: " + queue.dequeue()); 
	        System.out.println("Dequeue: " + queue.dequeue()); 
	        System.out.println("Dequeue: " + queue.dequeue()); 
	        System.out.println("Dequeue: " + queue.dequeue()); 
	    }
}
