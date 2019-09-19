package javainterviewquestion;

public class ConverStringCase {


	String convertCaseOfString(String name) {

		String upper= name.substring(0).toUpperCase();
		System.out.println(upper);
		String uppercase= name.substring(0,1).toLowerCase() + name.substring(1,5).toUpperCase() + name.substring(5, 8);
		System.out.println(uppercase);
		return null;
	}

	String convertCaseofWord(String name) {
		String[] s = name.split(" ");
		System.out.println(s);
		String ar[]= new String[s.length];
		for(int i=0;i<s.length;i++)
		{
			//System.out.println(s[i]);


			String firstupper = s[i].substring(0, 1).toUpperCase()+ s[i].substring(1,s[i].length());
			ar[i] = firstupper;
		}		
		System.out.println(String.join(" ", ar)); // Join array
		return null;

	}

	String replaceSpecificCharacter(String name, char m, char n) {

		String var= name.replace(m,n);
		System.out.println(var);
		return name;

	}
}

