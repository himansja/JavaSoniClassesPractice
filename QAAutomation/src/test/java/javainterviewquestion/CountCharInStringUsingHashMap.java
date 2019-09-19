package javainterviewquestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountCharInStringUsingHashMap {


	public void countCharUsingMap() {

		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		String filePath = projectPath + "\\TestData\\Stringfilereader.txt";
		System.out.println(filePath);

		try {
			FileReader f = new FileReader(filePath);// input file
			BufferedReader br = new BufferedReader(f); 
			String s = br.readLine();	//Reading file using bufferreader object and storing as string
			char[] charArray = s.toCharArray();

			Map<Character, Integer> stringCountMap = new HashMap<Character, Integer>();
			for(int i=0;i<charArray.length;i++) {


				if(stringCountMap.containsKey(charArray[i])) {
					stringCountMap.put(charArray[i], stringCountMap.get(charArray[i])+1);
				}
				else {
					stringCountMap.put(charArray[i], 1);
				}
			}

			System.out.println(stringCountMap);

		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
