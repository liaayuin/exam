package com.labQ2;
public class Stack {
	int arr[];
	int top;
	int capacity;
	Stack(int size){
		capacity=size;
		arr = new int[capacity];
		top=-1;
	}
	boolean isFull() {
		return top== capacity-1;
	}
	boolean isEmpty() {
		return top ==-1;
	}
	void push(int x) {
		if(isFull()) {
			System.out.println("Overflow\n Terminate the program");
		}
		else {
		arr[++top]=x;
		System.out.println("Inserted "+x);
		}


	}
	int pop(){
		if(isEmpty()) {
			System.out.println("Stack empty");
	        
		}
		else{
			return arr[top--];
		}
		return -1;

	}
	int size() {
		return top+1;
	}
	void showStack() {
		for(int i= 0; i<= top; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
