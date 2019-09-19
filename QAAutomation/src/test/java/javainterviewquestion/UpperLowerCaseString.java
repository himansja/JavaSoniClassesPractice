package javainterviewquestion;

public class UpperLowerCaseString {


	public void convertStringCase() {
		char c;
		char convert = 0;
		String result = "";
		String s = "hImaNshu";
		for(int i=0;i<s.length();i++) {
			c = s.charAt(i);
			if(Character.isUpperCase(c)) {
				convert = Character.toLowerCase(c);
			}
			else if(Character.isLowerCase(c)) {
				convert = Character.toUpperCase(c);
			}
			result = result + Character.toString(convert);

		}
		System.out.println(result);


	}

	void convertAlternateStringCase() {
		String a = "mynameishimanshu";
		char c,convert = 0;
		String result1 ="";
		int len = a.length();
		for(int i=0; i<len;i++) {
			c = a.charAt(i);
			if(!(i%2==0)) {
				convert = Character.toUpperCase(c);
			}
			else {
				convert = c;
			}
			
			result1 = result1 + Character.toString(convert);
			

		}
		System.out.println(result1);
	}
	
	
	static void convertAlternateCharInWordToString() {
		String s = "mine name is Himanshu";
		char convert=0;
		String result= "";
		String finalresult = "";
		String[] ar = s.split(" ");
		for(int i=0;i<ar.length;i++) {
			for(int k=0;k<ar[i].length();k++) {
				char c = ar[i].charAt(k);
				if(!(k%2==0)) {
					convert = Character.toUpperCase(c);
				}
				else {
					convert = c;
				}
				result = result + Character.toString(convert);
				
			}	

		}		System.out.println(result);
		
		

		
		
		
	}
}
