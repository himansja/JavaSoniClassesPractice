package javainterviewquestion;

public class StringPallindrome extends Stringreverse {

	void pallindromeString() {
		String s1= "Madam";
		String S= reverseStringUsingMethod(s1);

		if(s1.equalsIgnoreCase(S))
			System.out.println("String is pallindrome" +S);
		else {
			System.out.println("String is not pallindrome" +s1);
		}


	}

}
