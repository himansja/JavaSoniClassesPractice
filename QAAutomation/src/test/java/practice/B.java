package practice;

public class B extends A {

	public int add(int a, int b) {
		System.out.println("hello");
		return 1;

	}
	
	public String add () {
		int b= 10+5;
		System.out.println(b);
		return "hello"; 
	}
	
	 public B(int i)
	    {
	        super(++i);
	        System.out.println(i);
	    }

	public B() {
		// TODO Auto-generated constructor stub
	}
}

