package ch18.exam15;

import java.io.File;

public class Example2 {

	public static void main(String[] args) throws Exception {
		java.io.File file = new File("C:/Temp/data.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		file = new File("C:/Temp/dir1/dir2/dir3");
		if(!file.exists()) {
			file.mkdir();
		}
		file = new File("C:/Temp/data.txt");
		if(!file.exists()) {
			file.delete();
		}
		file = new File("C:/Temp/dir1/dir2/dir3");
		if(!file.exists()) {
			file.delete();
		}
	}

}
