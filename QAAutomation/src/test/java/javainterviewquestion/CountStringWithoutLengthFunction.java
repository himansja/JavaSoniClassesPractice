package javainterviewquestion;

public class CountStringWithoutLengthFunction {

	
	void countStringWithoutLenghtMethod(String name) {
		int i =0;	
		for(char c: name.toCharArray() ) {
			i++;
		}
	System.out.println("Lenghth of the string is" +i);
	}
}
