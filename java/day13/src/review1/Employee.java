package review1;

public class Employee {
//	Employee 클래스
	//필드
	String name;
	int salary;
	
	//생성자
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	//메소드
	double calculateBonus() {
		return salary * 0.1;
	}
	
}
