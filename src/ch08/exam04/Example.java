package ch08.exam04;

public class Example {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//Ÿ�̾� ����
		myCar.t1 = new KumhoTire(); //t1�� �������̽� Ÿ���̰� �������̽��� ��ȣŸ�̾� ��뤷 ����
		myCar.t2 = new KumhoTire();
		myCar.t3 = new HankookTire();
		myCar.t4 = new HankookTire();
		
		//�޷�����.
		myCar.run();
	}

}
