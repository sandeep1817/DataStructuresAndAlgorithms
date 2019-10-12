package com.algorithms.arrays;

import java.util.Scanner;

public class SecondLargestElementInArray {

	public static void main (String[] args) {
	    int maxNum=0;int secondMax=0;
	    Scanner sc = new Scanner(System.in);
	    int sizeOfArray = sc.nextInt();
	    int[] a = new int[sizeOfArray];
	    for(int i=0;i<sizeOfArray;i++){
	        a[i] = sc.nextInt();
	    }
	    for(int i=0;i<sizeOfArray;i++){
	        if(a[i]>maxNum){
	        	secondMax = maxNum;
	            maxNum = a[i];
	        }
	        else if(a[i]>secondMax && a[i]<maxNum){
	            secondMax = a[i];
	        }
	    }
	    System.out.println(" largest number: "+maxNum);
	    System.out.println("Second largest number: "+secondMax);
	}

}
