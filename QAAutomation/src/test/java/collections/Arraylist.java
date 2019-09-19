package collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public void arrayListMethod() {

		List<String> l =  new ArrayList<>();
		l.add("Himanshu");   /**adding values to list */
		l.add("Divya");     
		l.add("jain");
		l.add("10");
		l.remove("jain");
		System.out.println(l.get(0));



		/**Retrieving values from list */

		for(int i=0;i<l.size();i++) {
			l.get(i);
			System.out.println(l.get(i));
		}

		/**TypeCasting*/
		String.valueOf(11);  /**converting integer to string*/
		Integer.parseInt("20"); /** converting string to integer*/



		/**List Accepting any dataype*/

		List l1 = new ArrayList();
		l1.add(10);
		l1.add("him");
		l1.add(1.1);
		l1.add(1.1112323);
		l1.add(true);


		for(int j=0;j<l1.size();j++) {
			System.out.println(l1.get(j));
		}

	}




}
