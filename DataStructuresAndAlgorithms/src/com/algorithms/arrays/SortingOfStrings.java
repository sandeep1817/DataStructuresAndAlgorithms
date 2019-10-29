package com.algorithms.arrays;

import java.util.Scanner;

public class SortingOfStrings {
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int m = 256;
		int [] a = new int[m];
		for(int i=0;i<s.length();i++){
			a[s.charAt(i)]++;
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<a[i];j++){
				System.out.print((char)i);
			}
			/*if(a[i]!=0){
				System.out.print((char)i);
			}*/
		}
	}

}
