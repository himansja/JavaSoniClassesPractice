package cascadingMethods;

public class B {

	public A demo2() {
		System.out.println("Demo2");
		
		/*A a = new A();
		a.Demo();*/
		
		//OR
		
		return new A();
	}
}
