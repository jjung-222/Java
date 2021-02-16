package ch03;

public class Exam02 {

	public static void main(String[] args) {
		// 연산의 결과가 boolean 으로 나오는 연산기호
		
		int var1 = 2;
		int var2 = 3;
		
		boolean var3 = var1 == var2; //같으면 true 다르면 false
		boolean var4 = var1 != var2; //t
		boolean var5 = var1 > var2; //f
		boolean var6 = var1 >= var2; //f
		boolean var7 = var1 < var2; //t
		boolean var8 = !(var1 == var2); // 괄호안 결과 f -> 실행결과 t , ! = not 반대
		boolean var10 = ((var1 == var2) || (var1 < var2)); //    || = or 둘중하나만 하나가 t면 t
		boolean var11 = ((var1 == var2) && (var1 < var2));

	}

}
