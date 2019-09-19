package javainterviewquestion;

public class NumberPresentInFibbonaciSeries {

	public void numberPresentInFibbonaciSeries(int number) {
		int firstNumber =0;
		int secondNumber =1;
		int thirdNumber =0;
		
		while(thirdNumber<number) {
			thirdNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber=thirdNumber;
		}
		
		if(thirdNumber==number) {
			System.out.println("Number present in fibbonaci series");
		}
		
		else {
			System.out.println("number not present in fiboonaci series");
		}
	}
	
}
