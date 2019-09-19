package javainterviewquestion;


public class CountNonDuplicateWordsInStrings {


	public void countNonDuplicateWordsinStrings() {
		String name= "my my name issss my himmmaannnsshuuu";
		
		
		String ar[] = name.split("");
		int count=1;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {

				if(ar[i].equalsIgnoreCase(ar[j])) {
					count = count+1;
					ar[j]="0";
				}
				
				}
			if(ar[i]!="0") {
				System.out.println(ar[i]+" " +count);
				count=1;
			} 

		}	

	}

}






