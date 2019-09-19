package javainterviewquestion;

public class ReverseNumber {
 
	int sum =0;
	
	int reverseNum(int number) {
		while(number>0) {
			int remainder = number%10;
			sum = (sum*10) + remainder;
			number=number/10;
			
		}
		System.out.println(sum);
	return sum;
	}
}
