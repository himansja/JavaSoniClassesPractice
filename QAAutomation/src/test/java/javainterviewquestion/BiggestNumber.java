package javainterviewquestion;


import java.util.Arrays;



public class BiggestNumber {

	void maxNumber(int num[]) {
		//int num[] = { 1,2,3,4,5,65,76,5,4,33,4,34,232,3,2323};
		for(int i=0;i<num.length;i++) {
			for(int j=1;j<(num.length);j++) {
				if(num[j]>num[j-1]) {
					int temp = num[j];
					num[j]= num[j-1];
					num[j-1]= temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(num));
		System.out.println("Max number is " + num[0]);
		System.out.println("Minimum number is " +num[num.length-1]);
	}
}
