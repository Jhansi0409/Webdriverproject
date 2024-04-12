package filehandling1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WritingInNotepad {

	public static void main(String[] args)throws Throwable {
		//create the file
		File j=new File("D:/notepad1.txt");
		FileWriter fr=new FileWriter(j);
		BufferedWriter bw=new BufferedWriter(fr);
		bw.write("my curent goal is to get a job ");
		bw.newLine();
		bw.write("In a best company");
		bw.newLine();
		bw.write("With a good package");
		bw.flush();
		bw.close();
		

	}

}
