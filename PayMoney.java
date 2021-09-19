package com.gl.training;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] arg) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = input.nextInt();
		System.out.println("Enter the values of array");
		int[] values = new int[size];
		
		for (int i = 0; i < size; i++) {
			values[i] = input.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetCount = input.nextInt();
		
		if (targetCount <= 0) {
			System.out.println("The target count should be greater than 0");
		}

		for (int i = 0; i < targetCount; i++) {
			int count = 0, sum = 0;
			System.out.println("Enter the value of target");
			int targetValue = input.nextInt();

			for (int j = 0; j < size; j++) {
				sum = sum + values[i];
				 if(targetValue <= sum) {
					 count ++;
				 }
			}

			if (targetValue > sum) {
				System.out.println("Given target is not achieved");
			} else {
				System.out.println("Target achieved after " + (count+1) + " transactions");
			}

		}
	}

}
