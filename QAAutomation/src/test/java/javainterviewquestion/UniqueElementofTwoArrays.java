package javainterviewquestion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueElementofTwoArrays {


	public void uniqueElementofTwoArrays() {
		int ar[]= {1,2,3,4,5};
		int as[] = {5,7,8,1,2};
		
		

		List<Integer> l= new ArrayList<Integer>();
		for(int i=0;i<ar.length;i++) {
			l.add(ar[i]);
		}
		
		List<Integer> l2= new ArrayList<Integer>();
		for(int j=0;j<as.length;j++) {    /** Converting arrays into list */
			l2.add(as[j]);
		}
		
		/** merge two list to one */
		// l.addAll(l2);
		
		/** return unique values */
		 l.removeAll(l2);
		
		/** return common values only*/
		//l.retainAll(l2);
		
		
		
		
		
		 
		System.out.println(l);
	
		}
		
		
		
		
		
		
		
	}


