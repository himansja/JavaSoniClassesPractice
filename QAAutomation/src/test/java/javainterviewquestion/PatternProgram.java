package javainterviewquestion;

public class PatternProgram {

	public void pattern(int row) {
		int rowCount=1;

		for(int i=row;i>0;i--) {

			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}

			for(int j=1;j<=rowCount;j++ ) {
				System.out.print(rowCount+" ");
			}
			System.out.println();
			rowCount++;
		}


	}

	
	public void reversePatter(int row) {
		int rowCount=row;

		for(int i=0;i<row;i++) {

			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}

			for(int j=1;j<=rowCount;j++ ) {
				System.out.print(rowCount+" ");
			}
			System.out.println();
			rowCount--;
		}

	}
}
