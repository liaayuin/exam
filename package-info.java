package com.labQ3;
class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full, cannot push element");
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop element");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot peek element");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

class QueueUsingTwoStacks {
    private Stack stack1;
    private Stack stack2;

    public QueueUsingTwoStacks(int capacity) {
        stack1 = new Stack(capacity);
        stack2 = new Stack(capacity);
    }

    public void enqueue(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue element");
            return -1;
        }
        return stack1.pop();
    }

    public int peek() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty, cannot peek element");
            return -1;
        }
        return stack1.peek();
    }
}


