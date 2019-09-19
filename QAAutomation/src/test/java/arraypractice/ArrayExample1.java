package arraypractice;

public class ArrayExample1 {
	int a[] = new int[5]; // Syntax for Single dimension Array
	String b[] = new String[8]; //Syntax for Signle dimension Array

	int m[][]= new int [5][7];  //Syntax for Multidimension dimension Array

	void singleDimArray() {

		a[0] = 1;  // Assign value to array at index 1
		a[1]= 2; // Assign value to array at index 2
		a[3] = 6;// Assign value to array at index 3


		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

	void multiDimArray() {
		m[0][0] = 10;  //Assign value to multidimension array
		m[0][1] = 15;  
		m[0][4]= 20;
		m[2][2] =25;
		m[3][3]= 30;
		m[4][4]= 5;
		

		for(int i=0;i<m.length;i++) {

			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]);
			}
		}

	}

	public static void main(String[] args) {
		ArrayExample1 obj = new ArrayExample1();
		obj.singleDimArray();
		obj.multiDimArray();
	}
}
