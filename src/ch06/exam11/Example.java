package ch06.exam11;

public class Example {

	public static void main(String[] args) {
		User user = new User("ȫ�浿");	//if) new User�� null�̸� ������Ʈ �ͼ���	
		
		//�ν��Ͻ� ���(�ʵ�, �޼ҵ�)�� �ݵ�� ��ü ���� ������ ���ؼ� ����
		
		System.out.println(user.name);
		user.login();
		user.logout();
		
		//����~~~~
	}

}
