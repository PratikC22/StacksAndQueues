/***********************************************************************
 * In this code, stack of integers 56,30 and 70 is created and ability
 * to peek and pop is added.
 * 
 * @author Pratik Chaudhari
 * @since 26/06/2021
 ***********************************************************************/
package com.bridgelabz;

public class Runner {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.show();
		System.out.println();
		while (stack.peek() != null) {
			System.out.println("First element of the stack is " + stack.peek());
			stack.pop();
			stack.show();
		}
	}
}
