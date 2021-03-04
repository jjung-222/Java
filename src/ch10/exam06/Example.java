package ch10.exam06;

public class Example {

	public static void main(String[] args) {
		Account account = new Account();
		
		try {
		String ano = null;
		account.deposit(null, 0);
		} catch(NoAccountException e) {
			System.out.println(e.getMessage()); //알아서 처리해라
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
		} //account.java에 일반 예외가 있기 때문에 try/catch를 꼭 해줘야함
	}

}
