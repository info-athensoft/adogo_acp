package test.shared.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample1 {
	private static final String FILENAME = "lang.txt";

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;

		try {
			
			File f = new File((new ReadFileExample1()).getClass().getResource("").getPath()); 
			System.out.println(f);
			
			String dir = (new ReadFileExample1()).getClass().getResource("").getPath();
			System.out.println(dir);
			
			dir = dir.replaceAll("/", "\\"+"\\");
			System.out.println(dir);
			
			String filePath = dir+"\\"+"lang.txt";

			// br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
				String s = sCurrentLine;
				int i = s.indexOf("-");
				if(i>=0){
					s = s.substring(0,i);
				}
				s=s.trim();
				//System.out.println(s);
				
				int j = s.indexOf(" ");
				String s1 = "";
				String s2 = "";
				if(j>=0){
					s1 = s.substring(0,j).trim();
					s2 = s.substring(j).trim();
				}
				//System.out.println(s1+":"+s2);
				System.out.println("languageMap.put("+s1+",\""+s2+"\")"+';');
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}
}
