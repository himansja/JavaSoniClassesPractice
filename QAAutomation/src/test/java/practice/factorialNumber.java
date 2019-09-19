package practice;

public class factorialNumber {

	public static void factorNu(int a) {
		
		int n=1;
		for(int i=1;i<=a;i++) {
			n = i*n;
		}
	System.out.println(n);
	}
	
	public static void main(String[] args) {
		factorNu(10);
		
	}
}
