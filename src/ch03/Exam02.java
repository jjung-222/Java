package ch03;

public class Exam02 {

	public static void main(String[] args) {
		// ������ ����� boolean ���� ������ �����ȣ
		
		int var1 = 2;
		int var2 = 3;
		
		boolean var3 = var1 == var2; //������ true �ٸ��� false
		boolean var4 = var1 != var2; //t
		boolean var5 = var1 > var2; //f
		boolean var6 = var1 >= var2; //f
		boolean var7 = var1 < var2; //t
		boolean var8 = !(var1 == var2); // ��ȣ�� ��� f -> ������ t , ! = not �ݴ�
		boolean var10 = ((var1 == var2) || (var1 < var2)); //    || = or �����ϳ��� �ϳ��� t�� t
		boolean var11 = ((var1 == var2) && (var1 < var2));

	}

}
