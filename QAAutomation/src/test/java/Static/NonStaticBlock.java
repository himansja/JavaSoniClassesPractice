package Static;

public class NonStaticBlock  extends StaticBlock {

	NonStaticBlock(){
		System.out.println("Hello non static constructor");
	}
	
	{
		System.out.println("Hello Non static method1");	
	}
	{
		System.out.println("Hello Non static method2");	
	}
	{
		System.out.println("Hello Non static method3");	
	}
	{
		System.out.println("Hello Non static method4");	
	}


}
