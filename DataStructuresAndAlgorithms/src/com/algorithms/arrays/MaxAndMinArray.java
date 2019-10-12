package com.algorithms.arrays;

import java.util.Scanner;

public class MaxAndMinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfArray = sc.nextInt();
		int[] a = new int[sizeOfArray];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int max = a[0];int min = a[0];
		for(int j=1;j<a.length;j++){
			if(a[j]>max){
				max = a[j];
			}
			if(a[j]<min){
				min = a[j];
			}
		}
		System.out.println("Max number is: "+max);
		System.out.println("Min number is: "+min);
	}

}
