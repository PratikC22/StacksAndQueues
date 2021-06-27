/************************************************************************
 * In this code, queue of integers 56,30 and 70 is created and dequeue is
 * utilized. 
 * 
 * @author Pratik Chaudhari
 * @since 26/06/2021
 ***********************************************************************/
package com.bridgelabz;

public class Runner {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(56);
		queue.enqueue(70);
		queue.enqueue(30);
		System.out.println("Array before dequeue");
		queue.show();
		queue.dequeue();
		System.out.println("Array after dequeue");
		queue.show();
	}
}
