package ex06_오현택;

public class SavingAccount implements AdvanceAccount {
//	1) 필드선언
//	2) 생성자 만들기
//	3) implement한 인터페이스의 메소드들을 오버라이딩해서 구현
	double balance;
	String accountHolder;
	
	public SavingAccount(double balance, String accountHolder) {
		super();
		this.balance = balance;
		this.accountHolder = accountHolder;
	}

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addInterest(double rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(Account target, double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receive(double amount) {
		// TODO Auto-generated method stub
		
	}
}
