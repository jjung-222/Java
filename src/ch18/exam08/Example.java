package ch18.exam08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example {
	public static void main(String[] args) {
		
		String filePath = "C:/MyProjects/Java/src/ch18/exam08/data";
		try {
			Reader reader = new FileReader(filePath);
			
			char[] data = new char[2];
			int readNum = -1;
			String str = "";
			while((readNum = reader.read(data)) != -1) {
				str += new String(data, 0, readNum);
				System.out.println(str);
			}
			
			
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
