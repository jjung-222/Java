package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {
		
		String filePath = "C:/MyProjects/Java/src/ch18/exam01/photo1.jpg";
		try {
			InputStream is = new FileInputStream(filePath);
			//规过 1
			while(true) {
				int data = is.read();
				if(data == -1) {
					break;
				}
				System.out.print(data);
			}
			
			//规过 2
			int data = -1;
			while((data = is.read()) != -1) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
