package nestedClass;

public class mainClass {

	
	public static void main(String[] args) {
		
		memberClass m = new memberClass();
		m.i =20;
		
		memberClass.innerClass inner = m.new innerClass();
		inner.j =10;
		
		System.out.println("value of i="+ m.i + ", " + "value of j=" +inner.j);
		
		
		
		/** Creating object of inner static class */
		outerClass a = new outerClass();
		outerClass.StaticinnerClass s = new outerClass.StaticinnerClass();
		
		
		a.m =10;
		s.n =20;
		
		System.out.println("value of m= "+a.m);
		System.out.println("value on n= "+s.n);
		
		
		/** Implementation of Annoymous class - interface*/
		
		MyInterface i = new MyInterface() {

			@Override
			public void method1() {
				System.out.println("method 1 implemetation");
				
			}

			@Override
			public void method2() {
				System.out.println("method 2 implemetation");
				
			}

			
		};
		
		i.method1();  /** Calling method 1*/
		i.method2();  /** Calling method 2 */
		
		/** Implementation of Annoymous class - Abstract*/
		
		MyAbstractClass abs = new MyAbstractClass() {

			@Override
			void methodAbstract1() {
				// TODO Auto-generated method stub	
			}
		};
		
		abs.methodAbstract1(); //Calling abstract method
		abs.methoddefine1();   //Calling non abstract method
}
}


