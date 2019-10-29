package com.algorithms.arrays;

import java.util.Scanner;

public class CountOfSmallerElements {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int sizeOfArray = sc.nextInt();
		int[] a = new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Please enter the number to be comapred with");
		int number = sc.nextInt();
		for(int i=0;i<a.length;i++){
			if(a[i]<number){
				count++;
			}
		}
		System.out.println("No of numbers which are less than given number are: "+count);
	}

}
