package practice;

public class A {

	static int a=10;
	static {
		a=5;
	}
	
	public String add()
	{
		int a= 10+5;
		return "hello";

	}

	public int add(int a) {
		a=20+5;
		return a;
	}
	public int add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		//return "Hello Class String A";
		return c;
	}

	int i;

	public A(int i)
	{
	
		this.i = i--;
		System.out.println(i);
	}
 A(){
	 
 }
}

