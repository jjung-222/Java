package ch10.exam06;

public class Account {
	public void deposit(String account, int money) {
		if(account == null) {
			//예외가 발생된 것만 알려주자
			throw new NoAccountException("입금계좌가 없습니다.");
			//예외 클래스 없으면 만들어 주자 + NoAccountException.java
		}
		System.out.println("입금 성공");
		
	}
	
	public void withdraw(String account, int money) 
			throws NoAccountException, BalanceLackException {
		int balance = 10000;
		if(account == null) {
			throw new NoAccountException("출금 계좌가 없습니다.");
		} else if(money>balance) {
			throw new BalanceLackException("잔고가 부족합니다.");
		} else {
		System.out.println("출금 성공");
		}
	
	}
}
