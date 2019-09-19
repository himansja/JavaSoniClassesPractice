package javainterviewquestion;

public class DiamondPattern {
	public void pattern(int row) {
		int midrow= row/2;
		int rowCount=1;
		

		for(int i=midrow;i>0;i--) {

			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}

			for(int j=1;j<=rowCount;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
			rowCount++;
		}

		for(int i=0;i<=midrow;i++) {

			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}

			for(int j=1;j<=rowCount;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
			rowCount--;
		}

	}
}
