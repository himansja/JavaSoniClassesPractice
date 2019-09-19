package javainterviewquestion;

import java.util.Arrays;

public class ReverseArray {

	
	public void reverseArr(int ar[]) {
		int b[] = new int [ar.length];
		int j = ar.length;
		for(int i=0;i<ar.length;i++) {
			b[j-1]=ar[i];
			j= j-1;
		}
		 
		System.out.println("Reverse Array" +Arrays.toString(b));
	}
}
