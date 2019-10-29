package com.algorithms.arrays;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int[] a = new int[256];
		for(int i=0;i<s1.length();i++){
			a[s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length();i++){
			a[s2.charAt(i)]--;
		}
		for(int j=0;j<256;j++){
			if(a[j]!=0){
				 flag =1; 
				 break;
			}
		}
		if(flag ==0){
			System.out.println("Given strings are anagrams");
		}
		else{
			System.out.println("Given strings are not anagrams");
		}
	}

}
