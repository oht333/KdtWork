package ex06_오현택;

public interface AdvanceAccount extends Account {
	//1) 메소드 선언(구현부는 적지 말아야함)
	int balance = 0;
	
	void addInterest(double rate);
	
	void transfer(Account target, double amount);
	
	void receive(double amount);
}
