package ch10.exam06;

public class Example {

	public static void main(String[] args) {
		Account account = new Account();
		
		try {
		String ano = null;
		account.deposit(null, 0);
		} catch(NoAccountException e) {
			System.out.println(e.getMessage()); //�˾Ƽ� ó���ض�
		}
		
		String ano = "111-222-333";
		try {
			account.withdraw(ano, 1000);
			account.withdraw(ano, 1000000);
		} catch (NoAccountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (BalanceLackException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} //account.java�� �Ϲ� ���ܰ� �ֱ� ������ try/catch�� �� �������
	}

}
