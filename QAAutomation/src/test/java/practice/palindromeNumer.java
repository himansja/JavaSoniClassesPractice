package practice;

public class palindromeNumer {

	public void palindrome(int n) {
		int temp,r;
		int Sum=0;
		temp= n;
		while(n>0) {
			r= n%10;
			Sum= (Sum*10)+r;
			n=n/10;
		}	
		if(temp==Sum) 
			System.out.println("Number is pallindrrome"+n);

		else 
			System.out.println("Number is not pallindrome"+n);

	}


	public static void main(String[] args) {
		palindromeNumer a = new palindromeNumer();
		a.palindrome(4541);
	}
}

