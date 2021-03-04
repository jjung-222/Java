package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

public class Example2 {

	public static void main(String[] args) {
		
		try {
			InputStream is = System.in;
			int keyCode = is.read();
			System.out.println(keyCode);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}

}
