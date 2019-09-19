package collections;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class linkedHasMap {

	public void linkedHashmapCollectionMethod() {

		Map<Object,Object> m = new LinkedHashMap<Object,Object>(); /**1st arguments is Key, 2nd is value*/

		m.put("Name", "Himanshu");
		m.put("Last", "Jain");
		m.put("Designation", "ASCON");
		m.put("RollNo.", 123454);
		m.put("Salary", 6.8);
		m.put("Designation", "SCON"); /** MAP cannot have duplicate Keys, if defined it will override the value*/
		//m.put(1, m);  /**Can store same or another map*/
		//System.out.println(m);
		m.put(2,"abc");


		//System.out.println(m.get(1));  
		//System.out.println(m.get("Name"));
		//System.out.println(m.get("Name"));
		//System.out.println(m.get("Salary"));
		//System.out.println(m);   /**Return full map*/

		/** Iterating map key and value using Iterator*/
		Set<Object> s = m.keySet();
		Iterator<Object> itr = s.iterator();

		while(itr.hasNext()){

			Object a= itr.next();
			/** Displaying key */
			System.out.println("key :"+a);
			
			/** Displaying value*/
			System.out.println("Value of Key" +m.get(a));

		}
		
		/**Itrating map using enhanced for each loop*/
		
		Set<Entry<Object,Object>> set = m.entrySet();
		for(Entry<Object,Object> entry: set) {
			/** Displaying Key-value pair */
			System.out.println("Key "+ entry.getKey()+ " Value "+entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		linkedHasMap l = new linkedHasMap();
		l.linkedHashmapCollectionMethod();
	}
}
