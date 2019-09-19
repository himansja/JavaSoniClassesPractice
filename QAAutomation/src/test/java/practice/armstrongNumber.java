package practice;

public class armstrongNumber {

	public static void armsnumber(int n) {
	int Temp=n;
		int r;
		int cube=0;
		while(n>0) {
			r= n%10;
			cube= cube+(r*r*r);
			n=n/10;
		}
		System.out.println(cube);
		if(Temp==cube)
			System.out.println("number is Armstrong"+cube);
		else
			System.out.println("number is not Armstong"+cube);
	}
	public static void main(String[] args) {
		armsnumber(153);
	}
}




