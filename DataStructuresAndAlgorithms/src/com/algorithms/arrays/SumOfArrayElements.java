package com.algorithms.arrays;

import java.util.Scanner;

public class SumOfArrayElements {
	
	public static void main (String[] args) {
	    int sum=0;
	    Scanner sc= new Scanner (System.in);
	    int sizeOfArray = sc.nextInt();
	    int[] a = new int[sizeOfArray];
	    for (int i=0;i<sizeOfArray;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<sizeOfArray;i++){
	        sum = sum+a[i];
	    }
	    System.out.println("Sum of elements is: "+sum);
	}

}
