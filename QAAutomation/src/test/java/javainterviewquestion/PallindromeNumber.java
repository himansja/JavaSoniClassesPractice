package javainterviewquestion;

public class PallindromeNumber extends ReverseNumber{

	void pallindrome(int number) {
		int Temp = number;
		reverseNum(number);
		if(sum == Temp) 
			System.out.println("Number is pallindrom" +number);
		else
			System.out.println("Number is not pallindrome" +number);
			
	}
}
