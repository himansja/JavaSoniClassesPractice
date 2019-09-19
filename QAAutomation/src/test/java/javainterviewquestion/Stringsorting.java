package javainterviewquestion;

import java.util.Arrays;

public class Stringsorting {


	void stringsortJavaMethod() {

		char sr[] = {'a', 'b', 'd','z','m'};
		Arrays.sort(sr);
		System.out.println(sr);

	}

	void stringsortManualMethod() {
		char sr[] = {'a', 'b', 'd','z','m','c','l','i'};
		char temp;
		for(int j=0;j<sr.length;j++) {
			for(int i=1;i<(sr.length);i++)
				if(sr[i-1]>sr[i]) {
					temp = sr[i-1];
					sr[i-1]=sr[i];
					sr[i]= temp;
				}

		}


		System.out.println(Arrays.toString(sr));
		System.out.println(sr[0]);
		System.out.println(sr[sr.length-1]);
		

	}

}

