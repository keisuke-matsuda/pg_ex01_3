package pg_ex01_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class WordCount {
	public  static void main(String[] args){
		String[] word = null;
		List<String> wordList = new ArrayList<String>();

		read(wordList)
	}
	public static void read(wordList) {
		try {
			File file = new File("src/pg_ex01_3/sample.txt");
			BufferedReader br = new  BufferedReader(new FileReader(file));

			String line = br.readLine();
			while (line 	!= null ){
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
			}catch (IOException e){
				System.out.println(e);
		}
	}


}
