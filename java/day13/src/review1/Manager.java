package review1;

public class Manager extends Employee {
	//필드(부모클래스에 있는 필드를 상속했으니 필요없다)
	
	//생성자
	public Manager(String name, int salary) {
		super(name, salary);	//부모의 생성자(Employee 클래스)
	}

	
	//메소드
	@Override
	double calculateBonus() {
		return salary * 0.2;
	}
	
	
}
