package com.algorithms.arrays;

import java.util.Scanner;

public class PrintAlternateElementsArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sizeOfArray = sc.nextInt();
		int[] a = new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<sizeOfArray;i++){
			System.out.println(a[i]);
			i++;
		}
	}

}
