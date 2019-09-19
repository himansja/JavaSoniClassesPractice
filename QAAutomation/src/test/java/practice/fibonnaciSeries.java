package practice;

public class fibonnaciSeries {
	public static void object(int a) {
		/*B obj = new B();
		obj.add(1, 0);
		
		A obj1 = new B();
		A obj2 = new A();*/
		
		int n1= 0;
		int n2= 1;
		int n3;
		System.out.println(n1+ " " +n2);
		for(int i=2;i<a;i++) {
			n3= n2+n1;
			System.out.println(" " +n3);
			
			n1=n2;
			n2=n3;
			
					
		}
	}

	public static void main(String[] args) {
		object(20);
	}
	}
		

