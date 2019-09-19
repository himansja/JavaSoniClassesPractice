package practice;

public class ClassTwo extends ClassOne{
	void method(){
    
		System.out.println(i);
       int a=  i--;
        System.out.println(a);
        System.out.println(i);
    
	}
	
 
    static
    {
        --j;
    }
 
    public static void main(String[] args)
    {
    	
    	ClassTwo a = new ClassTwo();
    	a.method();
        System.out.println(i);
 
        System.out.println(j);
    }
}
