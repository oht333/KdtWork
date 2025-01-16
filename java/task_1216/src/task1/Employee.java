package task1;

import java.util.Objects;

public class Employee {
	//1) 필드생성
	//2) toString
	
	private String id;
	private String name;
	private int age;
	private String dpt;
	private int salary;
	
	//생성자
	public Employee(String id, String name, int age, String dpt) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.dpt = dpt;
	}

	// getter
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDpt() {
		return dpt;
	}
	public int getSalary() {
		return salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, age, dpt, name, salary);
	}
	
	@Override
	public String toString() {
		return "[Id=" + id 
				+ ", name=" + name 
				+ ", age=" + age 
				+ ", dpt=" + dpt 
				+ ", salary=" + salary 
				+ "]";
	}
	
	
	
}
