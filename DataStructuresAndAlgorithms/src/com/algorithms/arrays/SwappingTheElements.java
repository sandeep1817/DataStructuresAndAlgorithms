package com.algorithms.arrays;

import java.util.Scanner;

public class SwappingTheElements {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int sizeOfArray = sc.nextInt();
		int[] a = new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Please enter the position to be swapped");
		int position = sc.nextInt();
		if(position<=a.length){
			int start = a[position-1];
			int end = a[a.length-position];
			a[position-1]= end;
			a[a.length-position] = start;
			for(int i=0;i<sizeOfArray;i++){
				System.out.println(a[i]);
			}
		}
	}
}
