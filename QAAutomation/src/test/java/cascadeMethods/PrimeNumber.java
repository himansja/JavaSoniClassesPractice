package cascadeMethods;

public class PrimeNumber {

	static void prime()
	{
		int Sum = 0;
         for(int k=1;k<100;k++) //For finding prime no. between 1-100
      {
     	     boolean flag=false;
		
		         for(int i=2;i<k-1;i++)
		{
			int p = k%i;
			if(p==0)
			{
				flag =true;
				break;
			}
			else {
				flag=false;

			}
		}
			/*if(flag==false)  // Condition to check whether no. is prime or not
			{
				System.out.println("Numer is prome"+ n);
			}
			else {
				System.out.println("Numer is not prime"+ n);
			}
		*/
        if(flag==false)
        {
        	
        	System.out.println(k); //Printing prime no. from 1-100
        	Sum = Sum + k; //Calculating the sum of prime no. between 1-100
        	
        }
        
		         
}
         System.out.println(Sum);   
	}
	
public static void main(String[] args) {
	prime();
}
}
