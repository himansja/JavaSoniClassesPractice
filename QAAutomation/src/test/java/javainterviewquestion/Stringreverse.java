package javainterviewquestion;

public class Stringreverse {
	String name =  "Akanksha" ; // Declare string
	
	void countString() {

		int s= name.length(); // Count the length of the string
		System.out.println(s);
	}

	void readCharOnebyOne() {
		char n1= name.charAt(0); // reading char at index 0
		char n2= name.charAt(1); // reading char at index 1
		System.out.println(n1+ "" +n2);

		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
	}
	String reverseString(String rev) {
		String reverse = "";
		for(int i=0;i<rev.length();i++) {


			reverse = rev.charAt(i) + reverse; //reversing the string

		}
		System.out.println(reverse);

		return reverse;
	}
	String reverseStringUsingMethod(String rev) {
		
		String s1= reverseString(rev); //reversing the string using java inbuilt method
		return s1;
	}


}
