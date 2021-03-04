package ch06.exam10;

public class Example {

	public static void main(String[] args) { //��ü�� ��� heap ������
		Changer changer = new Changer();
		
		//Call by Value(���� �����ؼ� ȣ��)
		int value = 1; //value = 1
		changer.change(value); //changerȣ��Ǽ� changer Ŭ������ �� ���� �ٲ�
		//int value = v1; �� ���� �ٸ�����
		System.out.println(value);
		
		//Call by Reference(������ �����ؼ� ȣ��) ������ ���� �ٲܼ� ����(����) �ٸ� �͵��� ���� �ٲ�
		String v3 = "A";
		changer.change(v3); //�������̶� heap�� A�� ���� v3���� �ּҰ��� ��
		System.out.println(v3);
		
		// Call by Reference(������ �����ؼ� ȣ��)
		int[] arr1 = {0, 0, 0};
		changer.change(arr1);
		System.out.println(arr1[0]);
		
		String[] arr3 = {"A", "B", "C"};
		changer.change(arr3);
		System.out.println(arr3[0]);
		
		Member m1 = new Member();
		System.out.println(m1.age); //MemberŬ������ age���� �����ͼ� 1�� ����
		changer.change(m1);
		System.out.println(m1.age);
			
		
	}

}
