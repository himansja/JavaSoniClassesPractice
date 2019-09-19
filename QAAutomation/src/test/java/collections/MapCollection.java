package collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {


	public void mapCollectionMethod() {

		Map<String,String> m = new HashMap<String,String>(); /**1st arguments is Key, 2nd is value*/

		m.put("Name", "Himanshu");
		m.put("Last", "Jain");
		m.put("Designation", "ASCON");

		m.put("Name", "Divya"); /** MAP cannot have duplicate Keys, if defined it will override the value*/

		System.out.println(m.get("Name"));
		System.out.println(m.get("Name"));
		System.out.println(m);  /**Return full map*/
	}


}

