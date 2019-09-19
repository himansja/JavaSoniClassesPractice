package incerementDecrement;

public class incrementDecrementClass {

	int i= 0, j= 1,k=2;
	void method1() {
		i = ++j + k++;
		System.out.println(i);
	}
	
	void method2() {
		
		i= ++i + k++;
		System.out.println(i);
		
			}
	
	void method3() {
	int x = 20;
	int a = x-- - --x;
	System.out.println(a);
	System.err.println(x);
	}
	
	public static void main(String[] args) {
		incrementDecrementClass ob = new incrementDecrementClass();
		//ob.method1();
		//ob.method2();
		ob.method3();
	}
}
