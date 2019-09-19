package javainterviewquestion;

public class PrimeNumber {

	
	
	void primeNumber() {
		for(int a=0;a<100;a++) {
			int num= a;
			boolean flag= false;
			if(num<2) 
				System.out.println("number is not prime" +num);

			else {
				for (int i=2;i<num;i++) {
					int result;
					result= num%i;
					if(result==0) {
						flag = true;
						System.out.println("number is not prime"+num);
						break;
	
					}

				}

				if(flag==false) 
					
					System.out.println("Number is prime" +num);
			}
		}
	}
}


