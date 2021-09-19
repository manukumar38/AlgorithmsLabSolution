package com.gl.training;

import java.util.Scanner;

class CurrencyDenomination {

	static public void main(String[] ab) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = input.nextInt();
		System.out.println("Enter the currency denominations value");
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}
		
		int[] arr1 = new int[arr.length];
		System.out.println("Enter the amount you want to pay");
		int sum = input.nextInt(),temp = 0;
		
		if(sum <= 0) {
			System.out.println("Enter a valid sum amount");
		}
		
		for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] < arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		
		if(sum < arr[0]) {
			System.out.println("Enter a valid sum greater than the available denominations");
		}
		
		try {
		for(int i=0 ; i<arr.length; i++) {
			
			if(sum >= arr[i]) {
				arr1[i] = sum/arr[i];
				sum = sum - arr1[i] * arr[i];
			}
			
		}
		
		if(sum > 0) {
			System.out.println("Exact amount cannot be given with the highest denomination");
		}else {
			System.out.println("Your payment approach in order to give no of notes will be :");
			for (int i=0 ; i<arr.length; i++) {
				if(arr1[i] != 0) {
					System.out.println(arr[i] + ":" + arr1[i]);
				}
			}
		}
		
		} catch (ArithmeticException e) {
			System.out.println("0 denominations is invalid");
		}
	
	}

	}

	

