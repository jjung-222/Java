package ch05;

public class Exam01 {

	public static void main(String[] args) {

		int var1 = 10;
		int var2 = 10;
		
		//값비교
		System.out.println(var1 == var2); //true
		System.out.println(var1 != var2); //false
		
		String var3 = "자바";
		String var4 = "자바";
		
		//번지 비교
		System.out.println(var3 == var4); //true
		System.out.println(var3 != var4); //false
		
		String var5 = "이연정";
		String var6 = new String ("자바");
		
		//번지 비교
		System.out.println(var3 == var4); //true
		System.out.println(var3 != var4); //false

	}

}
