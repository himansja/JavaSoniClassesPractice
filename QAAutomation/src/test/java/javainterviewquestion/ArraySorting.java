package javainterviewquestion;

import java.util.Arrays;

public class ArraySorting {


	void sortArrayUsingJavaInBuiltMethod() {
		int ar[] = {5,123,46,59,46};
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++) {


			System.out.println(ar[i]);

		}
	}

	void sortArrayMethod(int ar[]) {
		int temp;
		for(int j=0;j<ar.length;j++) {
			for(int i=1;i<(ar.length-j);i++)
				if(ar[i-1]>ar[i]) {
					temp = ar[i-1];
					ar[i-1]=ar[i];
					ar[i]= temp;
				}
			
			}
	
		
		System.out.println(Arrays.toString(ar));
	
		
	}
}
