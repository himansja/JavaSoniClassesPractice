package javainterviewquestion;

public class SwapNumber {

	
	void Swaptwonumber(int n1,int n2) {
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println(n1+ " " +n2);
		
	}
}
