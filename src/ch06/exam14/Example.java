package ch06.exam14;

public class Example {

	public static void main(String[] args) {
		//Korean.NATION = "�ѱ�"; //final�� �ѱ��̶� �Ἥ �ٸ� �� �� �� ����. ���� Korean Ŭ�������� "�ѱ�"�̶�� �� ������ ����
		System.out.println(Korean.NATION);
		
		Korean k1 = new Korean("123456-1234567"); //���⼭ ���ѹ� ssn���� �����ؼ� ����
		// k1.ssn = "664433-1111111"; (x)
		
		System.out.println(Math.PI);
		double area = 10 * 10 * Math.PI;
		
		
	}

}
