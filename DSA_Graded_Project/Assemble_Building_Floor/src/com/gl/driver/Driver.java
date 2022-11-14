package com.gl.driver;

import java.util.Scanner;

import com.gl.model.BuildingFloorAssembler;

//it is driver class which have main class.
public class Driver {
	public static void main(String[] args) {
		System.out.println("enter the total no of floors in the building");
		Scanner sc = new Scanner(System.in);
		try {// if user give input except integer it will handle.
			int noOfFloor = sc.nextInt();
			if (noOfFloor > 0) {// if input is Zero or negative it will handle.
				BuildingFloorAssembler p = new BuildingFloorAssembler();
				p.assembler(noOfFloor);
			} else {
				System.out.println("Please enter the positive integer except 0");
			}
		} catch (Exception e) {
			System.out.println("please enter the valid floor size");
		}
	}
}
