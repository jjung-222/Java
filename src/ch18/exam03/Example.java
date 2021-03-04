package ch18.exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "C:/MyProjects/Java/src/ch18/exam03/data.txt";
		try {
			InputStream is = new FileInputStream(filePath);
			byte[] data = new byte[3];
		
			int readNum = -1;
			while((readNum = is.read(data, 2, 3)) != -1) {
				System.out.println(readNum + ": " + Arrays.toString(data));
			}
			is.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
