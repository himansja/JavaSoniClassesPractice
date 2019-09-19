package TestSenarios;

public class Splendor extends Bike {
 int i = 20;
	void run() {
		System.out.println("Splendor");
	}

public static void main(String[] args) {
	Bike b = new Splendor();
	b.run();  /**Output = Splendor*/
	System.out.println(b.i);
	
	Splendor b1 = new Splendor();
	b1.run(); /**Output = Splendor*/
	System.out.println(b1.i);
	
	Bike b2 = new Bike();
	b2.run(); /** Output= Running */
	System.out.println(b2.i);
	
	 
}

}

