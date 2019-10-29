package com.algorithms.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepetitiveFirstChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++){
			if(m.containsKey(ch[i])){
				m.put(ch[i], m.get(ch[i]) + 1);
			}
			else{
			m.put(ch[i], 1);
			}
		}
		System.out.println(m.entrySet());
		for(int i=0;i<ch.length;i++){
			if(m.get(ch[i]) == 1){
				System.out.println("first non repeating character: " + ch[i]);
				break;
			}
		}
	}
}
