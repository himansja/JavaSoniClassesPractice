package practice;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
	
		
		/*List<> x = new List<>();

				x.add(1);
				x.add(2);
		for( int i =0;i<x.size();i++)
		{
			System.out.println(x.get(i));
		}*/
		
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Amit");  
		al.add("Vijay");  
		al.add("Kumar");  
		al.add("Sachin");  
		
		
		System.out.println(al.get(0));  
	}
}
