package exceptionTask;

public class Account {
	private int balance;

	
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	
	
//	public int getBalance() {
//		return balance;
//	}
//
//
//
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}



	void withdraw(int price) throws AccountException {
		if(balance < price) {
			try {
				throw new AccountException("금액이 적습니다");
			} catch (AccountException e) {
				e.printStackTrace();
			}
		} else {
			this.balance -= price;
			System.out.println(price + "원이 출금되었습니다. 현재 잔고는 " + balance + "원입니다.");
		}
	}
	
	void deposit(int price) {
		if(price <= 0) {
			try {
				throw new AccountException("입금할 금액은 0원 이상입니다");
			} catch (AccountException e) {
				e.printStackTrace();
			}
		} else {
			this.balance += price;
			System.out.println("추가 입금된 금액은 " + price + "원입니다.");
			System.out.println("현재잔고는 " + balance + "원입니다.");
		}
	}
}
