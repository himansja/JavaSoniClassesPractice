package javainterviewquestion;

public class ReturnMultipleValuesThroughMethod {

	
	public int[] sum(int a, int b) {
		int result[] = new int[4];
		
		//int result[0] = a+b;
		result[1] = a-b;
		result[2]=a*b;
		result[3]= a/b;
		result[0] = a+b;
		
		return result;
	}
}
