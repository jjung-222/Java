package ch05;

public class Exam12 {

	public static void main(String[] args) {
		Season nowSeason = Season.WINTER;
		if(nowSeason == Season.SUMMER) {
			System.out.println("�½��ϴ�.");
		} else {
			System.out.println("�ƴմϴ�.");
		}
		
		//String loginResult = "ID�� Ʋ��";
		//int loginResult = 2; //�������� ������ �׷��� �Ʒ�ó�� ����
		LoginResult loginResult = LoginResult.FAILURE_ID; 
		if(loginResult == LoginResult.SUCCESS) {
			System.out.println("�α��� �����߱���.");
		} else if(loginResult == LoginResult.FAILURE_ID) {
			System.out.println("���̵� �ٽ� �Է��ϼ���.");
		} else {
			System.out.println("�н����尡 Ʋ���ϴ�.");
		}
	}

}
