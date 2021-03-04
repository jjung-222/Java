package ch11.exam02;

import java.util.Date;

public class Example {

	public static void main(String[] args) {
		Object var1 = new Object();
		System.out.println(var1.toString()); //패키지 정보
		
		Date var2  = new Date();
		System.out.println(var2.toString());
		
		String var3 = "abc";
		System.out.println(var3.toString());
		
		Member var4 = new Member("winter", "늦겨울");
		System.out.println(var4.toString());
		System.out.println(var4);
	}

}
