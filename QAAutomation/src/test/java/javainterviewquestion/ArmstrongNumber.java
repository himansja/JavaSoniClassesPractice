package javainterviewquestion;

public class ArmstrongNumber {

	int Cube=0;

	void armstrongNum(int number) {
		int Temp = number;

		while(number>0) {
			int rem = number%10;
			Cube= Cube +(rem*rem*rem);
			number = number/10;
		
		}
		System.out.println(Cube);
		if(Temp==Cube) 
			System.out.println("Number is Armstrong "+Temp);
		else
			System.out.println("Number is not Armstrong "+Temp);
	}
}


