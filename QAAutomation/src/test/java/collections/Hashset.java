package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Hashset {


	public void HashSetMethod() {

		Set<Object> s = new HashSet<Object>(); /**HashSet accpecting any data type*/
		s.add("ssdasdas");
		s.add(10);
		s.add(10);
		s.add(1.111);
		s.add("Himanshu");
		s.add("Himanshu");
	

		Iterator<Object> Itr = s.iterator();

		while(Itr.hasNext()) {
			System.out.println(Itr.next());
		}

		/**Converting Set to List*/	
		List l = new LinkedList<>(s);

		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}

	}
}
