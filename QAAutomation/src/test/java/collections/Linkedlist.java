package collections;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	
	public void linkedlistmethod() {
		List<Object> ll = new LinkedList<Object>();  /**List accepting any data type*/
		ll.add("asda");
		ll.add(10);
		ll.add(true);
		ll.add(10);
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
	}
}
