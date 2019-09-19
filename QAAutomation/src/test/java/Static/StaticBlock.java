package Static;


public class StaticBlock {
int a,b,c;
static int d;

	
	static {
		StaticBlock s = new StaticBlock();
	s.a= s.b+s.c+d;
	
System.out.println("Hello Static block1");
	
}

 static {
	
System.out.println("Hello Static block2");
	
}
static {
	
System.out.println("Hello non Static block3");
	
}
{
	
System.out.println("Hello non Static block4");
	
}

}
