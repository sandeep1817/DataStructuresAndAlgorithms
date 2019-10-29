package com.algorithms.arrays;

import java.util.Scanner;

public class CompareTwoArrays {

	public static void main(String[] args) {
		int countOfA=0 , countOfB = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array: ");
		int sizeOfArray = sc.nextInt();
		int[] a = new int[sizeOfArray];
		int[] b = new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<sizeOfArray;i++){
			b[i] = sc.nextInt();
		}
		for(int i=0;i<sizeOfArray;i++){
			if(a[i]>b[i]){
				countOfA++;
			}
			if(a[i]<b[i]){
				countOfB++;
			}
		}
		System.out.println(countOfA+" "+countOfB);
	}

}
