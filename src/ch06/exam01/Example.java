package ch06.exam01;

public class Example {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(); //.class�� ���Ȱ� �ϳ��� Ŭ������ �ΰ��� ��ü�� �����
		Student s3 = s1;
		
		//���������� ���� ��
		//������ ���� ���� ��ü ����
		if(s1==s2) { // new 2�� �ٸ���ü
			System.out.println("���� ��ü");
		} else {
			System.out.println("�ٸ���ü");
		}
		
		if(s1==s3) { // new 2�� �ٸ���ü
			System.out.println("���� ��ü");
		} else {
			System.out.println("�ٸ���ü");
		}
	}

}
