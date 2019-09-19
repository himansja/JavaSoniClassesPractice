package cascadeMethods;

public class MainRun {

	void run() {
		testAbstract n = new Implementabstract();
		testInterface n1 = new TestImplementation();
		n.add();
		n1.divide();
		n.divide(1, 2);
	}
	
}
