package com.gl.utils;

import java.util.Queue;

public class ReverseAQueue {
	// Java program to reverse a queue recursively

	static Queue<Integer> queue;

	// Utility function to print the queue
	static void Print() {
		while (!queue.isEmpty()) {
			System.out.print(queue.peek() + " ");
			queue.remove();
		}
	}

	// Recursive function to reverse the queue
	public static Queue<Integer> reverseQueue(Queue<Integer> q) {
		// Base case
		if (q.isEmpty())
			return q;

		// Dequeue current item (from front)
		int data = q.peek();
		q.remove();

		// Reverse remaining queue
		q = reverseQueue(q);

		// Enqueue current item (to rear)
		q.add(data);

		return q;
	}
}
