package ch05;

public class Exam01 {

	public static void main(String[] args) {

		int var1 = 10;
		int var2 = 10;
		
		//����
		System.out.println(var1 == var2); //true
		System.out.println(var1 != var2); //false
		
		String var3 = "�ڹ�";
		String var4 = "�ڹ�";
		
		//���� ��
		System.out.println(var3 == var4); //true
		System.out.println(var3 != var4); //false
		
		String var5 = "�̿���";
		String var6 = new String ("�ڹ�");
		
		//���� ��
		System.out.println(var3 == var4); //true
		System.out.println(var3 != var4); //false

	}

}