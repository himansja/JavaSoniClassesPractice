package Polymorphism;


public class Child extends Parent {
	int a= 10;
	int b;
	
	public Child(int b, int n) {
		super(b,n);
		System.out.println(super.b);
		System.out.println(b);
		
		this.b=b;
		//System.out.println(b);
		//int c= b + n;
		//System.out.println(c);
	}
	
	void test() {
		System.out.println(b);
		
	}
}
