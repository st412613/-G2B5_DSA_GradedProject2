package com.gl.model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import com.gl.utils.ReverseAQueue;
import com.gl.utils.Support;

//model class in which function play.
public class BuildingFloorAssembler {
	Integer[] floorcollection;// to store input data
	Queue<Integer> floor = new LinkedList<>();// it is type of data collection which follow FIFO rule.
	// int noOfFloor;

	public void assembler(int noOfFloor) {// this is a method in which it handle input and output.
		// ..............................Input Section..................\\
		int j = noOfFloor;
		floorcollection = new Integer[noOfFloor];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < noOfFloor; i++) {// this loop take input store data in floorcollection[].
			System.out.println("enter the floor size given on day : " + (i + 1));
			floorcollection[i] = sc.nextInt();
		}
		// .........................Output Section.......................\\
		System.out.println("The order of construction is as follows");
		for (int i = 0; i < noOfFloor; i++) {
			if (j == floorcollection[i]) {
				System.out.print("Day:" + (i + 1) + "\n" + j + " ");
				int a = j = j - 1;
				while (!floor.isEmpty() && j == a) {
					Support sort = new Support();// this object belongs to 'Support' class
					floor = sort.sortQueue(floor);// it sort queue(LinkedList) in decreasing order.
					// then first element become smaller
					floor = ReverseAQueue.reverseQueue(floor);// it reverse the queue(LinkedList) floor.
					// And find greatest no at first place .we can poll that element.
					a = floor.poll();
					if (j == a) {
						System.out.print(j + " ");
						j--;
						a = a - 1;
					} else {
						floor.add(a);
					}

				}

			} else {
				floor.add(floorcollection[i]);
				System.out.println("Day:" + (i + 1));
				// System.out.println();
			}
			System.out.println();
		}
		// success condition
		if (!floor.isEmpty()) {
			System.out.println("Assembling is not successfull.\nPlease enter valid floor size");
		} else {
			System.out.println("Assembling successfull!!");
		}
	}
}
