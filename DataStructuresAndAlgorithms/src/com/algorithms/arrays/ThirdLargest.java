package com.algorithms.arrays;

import java.util.Scanner;

public class ThirdLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfArray = sc.nextInt();
		int [] a = new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++){
			a[i]=sc.nextInt();
		}
		int max = a[0]; int secondMax = 0;int thirdMax = -1;
		for(int i=1;i<sizeOfArray;i++){
			if(a[i]>max){
				thirdMax = secondMax;
				secondMax = max;
				max = a[i];
			}
			else if(a[i]>secondMax && a[i]<max){
				thirdMax = secondMax;
				secondMax = a[i];
			}
			else if(a[i]<secondMax && a[i]<max && a[i]>thirdMax){
				thirdMax=a[i];
			}
		}
		System.out.println("Max number is: "+max);
		System.out.println("Second max is: "+secondMax);
		System.out.println("Third max is: "+thirdMax);
    }

}
