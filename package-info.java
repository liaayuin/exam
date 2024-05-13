package com.labQ2;
class Main{
	public static void main(String[] args) {
		Stack stack = new Stack(10);
	    stack.pop();
	    stack.push(1);
	    stack.push(2);
	    stack.push(3);
	    stack.push(4);

	    stack.pop();
	    System.out.println("\nAfter popping out");
	     stack.showStack();
	}
	
}