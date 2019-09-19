package javainterviewquestion;

public class CountChar {

	int countNumOfChar(String name, char s) {
		String var= Character.toString(s);  // Type casting character to string
		int count = 0;
		for(int i=0;i<name.length();i++) {
			if(var.equalsIgnoreCase( Character.toString(name.charAt(i))))
				count++;
		}
		System.out.println(count);
	return count;
	}
	
}
