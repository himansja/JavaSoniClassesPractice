package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHasSet {


	public void HashSetMethod() {

		Set s1 = new LinkedHashSet();
		s1.add("HimanshuJain");
		s1.add(10);
		s1.add(11);
		s1.add(1.111);
		s1.add("Himanshu");
		s1.add("Himanshu");

		Iterator<Object> Itr = s1.iterator();

		while(Itr.hasNext()) {
			System.out.println(Itr.next());
		}
	}

}
