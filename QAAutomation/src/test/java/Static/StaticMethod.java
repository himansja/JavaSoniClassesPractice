package Static;

public class StaticMethod {

	int a,b,c;
	static String name;
	static int i;
	
	public static void method() {
		StaticMethod obj = new StaticMethod();
		i=obj.a+obj.b;
		
		System.out.println(name);
		//method1();
	}
public void method1() {
	method();
}
}
