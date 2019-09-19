package Static;

public class MainMethod {

	
	public static void main(String args[]) {
// Static block is executed once at the time of class loading		
		NonStaticBlock obj = new NonStaticBlock(); // Non Static block is executed when object is created
		//NonStaticBlock obj1 = new NonStaticBlock();
		//NonStaticBlock obj2 = new NonStaticBlock();
		//NonStaticBlock obj3= new NonStaticBlock();
	}

}
