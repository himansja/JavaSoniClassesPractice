package cascadeMethods;



public class RevString {

	void reverseUsingSplitfxn()
	{

		String name ="Rahu_e_Yadav";

		String ar[] = name.split("_");     

		String Rev ="";
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
			Rev =ar[i] + Rev;

		}
		System.out.println(Rev);
	}

	void reverseWithoutSplitfxn()
	{
		String myname = "My name is himanshu jain";

		int lenOfString= myname.length();
		String rev ="";
		for(int i=0;i<lenOfString;i++)
		{
			rev = myname.charAt(i) + rev;
		}
		System.out.println(rev);

	}

	void StringConvertCapital()
	{
		String convertname = "hello how are you";
		String cs[] = convertname.split(" ");
        String converttouppercase = convertname.toUpperCase();
        	//	System.out.println(converttouppercase);
        		
		for(int j=0;j<cs.length;j++)
		{
			String result1 = cs[j].substring(0, 1).toUpperCase() + cs[j].substring(1);
			String result  = cs[j].substring(0, 1) + cs[j].substring(1,2).toUpperCase()+ cs[j].substring(2);
			System.out.println(result);
			//System.out.println(result1);
			
		}
	}
	
}