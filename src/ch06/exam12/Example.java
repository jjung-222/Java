package ch06.exam12;

public class Example {

	public static void main(String[] args) { //���� Ŭ����
		//�ùٸ� ��� ���
		System.out.println(Calculator.pi);
		Calculator.plus(3, 5);
		
		//�߸��� ��� ���
		Calculator myCalc = new Calculator();
		System.out.println(myCalc.pi); //���� ���� static�ε� ��ü ���� �ߴٰ� ����
		myCalc.plus(3, 5);
	}

}
