package filehandling2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadingInNotepad {

	public static void main(String[] args) throws Throwable {
		FileReader fr=new FileReader("D:/filehandling.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null){
			Thread.sleep(5000);
			System.out.println(str);
			
		}
	}

}
