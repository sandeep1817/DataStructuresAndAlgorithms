package com.algorithms.arrays;

import java.util.Scanner;

public class PrimeNumbersInArray {

	public static void main(String[] args) {
		int count = 0;int flag =0;
		Scanner sc = new Scanner(System.in);
		int sizeOfArray = sc.nextInt();
		int[] a = new int[sizeOfArray];
		int[] prime = new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++){
			a[i] = sc.nextInt();
		}
		for(int j=0;j<sizeOfArray;j++){
			if(a[j]==0 || a[j]==1){
				flag = 1;
			}
			else{
				int r = a[j]/2;
				flag =0;
				for(int k=2;k<=r;k++){
					if(a[j]%k==0){
						flag =1;
						break;
					}
				}
			}
			if(flag == 0){
				prime[count] = a[j];
				count++;
				System.out.println("Count is:"+count);
			}
		}
		for(int c:prime){
			System.out.println("Prime Numbers are "+c);
		}
	}

}
