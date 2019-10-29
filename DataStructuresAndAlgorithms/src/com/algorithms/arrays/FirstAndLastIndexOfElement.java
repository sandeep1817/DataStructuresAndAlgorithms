package com.algorithms.arrays;

import java.util.Scanner;

public class FirstAndLastIndexOfElement {

	public static void main(String[] args) {
		int firstIndex =0, lastIndex = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int sizeOfArray = sc.nextInt();
		int[] a = new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Please enter the number whose index has to be found");
		int key = sc.nextInt();
		for(int i=0;i<sizeOfArray;i++){
			if(a[i]==key){
				 firstIndex = i;
				 break;
			}
		}
		for(int i=sizeOfArray-1;i>0;i--){
			if(a[i]==key){
				 lastIndex = i;
				 break;
			}
		}
		System.out.println("First index is: "+firstIndex+" last index is: "+lastIndex);
	}

}
