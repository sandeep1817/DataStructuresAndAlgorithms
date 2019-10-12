package com.algorithms.arrays;

import java.util.Scanner;

public class PalindromicArrayOfIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTcs = sc.nextInt();
		int sizeOfArray = sc.nextInt();
		int[] elements = new int[sizeOfArray];
		for(int i=0;i<elements.length-1;i++){
			elements[i] = sc.nextInt();
		}
		palinArray(elements,noOfTcs);
	}
	public static int palinArray(int[] a, int n)
    {
        int result = 0;
        for(int i=0;i<n;i++){
            int num = a[i];
            int revNum = 0;
            while(num>0){
                revNum = revNum*10+num%10;
                num = num/10;
            }
            if(revNum == a[i]){
                result = 1;
            }
          else{
              result=0;
              break;
          }
        }
        return result;

}
}
