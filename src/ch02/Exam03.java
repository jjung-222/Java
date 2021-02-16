package ch02;

public class Exam03 {

	public static void main(String[] args) {
		// int 타입 이하의 피연산자의 연산은 결과가 int
		byte var1 = 10;
		byte var2 = 20;
		// byte var3 = var1 + var2; //error
		int var3 = var1 + var2;
		
		int var4 = 10;
		int var5 = 20;
		int var6 = var4 + var5;
		
		int var7 = 10;
		long var8 = 20;
		long var9 = var4 + var5;
		
		int var10 = 10;
		double var11 = 1.5;
		double var12 = var10 + var11;

	}

}
