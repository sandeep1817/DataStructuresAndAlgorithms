package com.algorithms.arrays;

import java.util.Scanner;

public class DisplayLongestName {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String[] names = new String[sc.nextInt()];
		for(int i=0;i<names.length;i++){
			names[i] = sc.next();
		}
		int max = 0;
		for(int i=0;i<names.length;i++){
			char[] ch = names[i].toCharArray();
			int length =ch.length;
			if(length>max){
				max = length;
				 count = i;
			}
		}
		
		System.out.println("Greatest name is: "+names[count]);
	}

}
