package cascadingMethods;


public class MainClass {

	public static void main(String[] args) {
		C c = new C();
		c.demo3();
		//B b = c.demo3(); 
		//A a = b.demo();
		// OR we can write below code to invoke directly A class
		c.demo3().demo2().Demo();


	}


}
