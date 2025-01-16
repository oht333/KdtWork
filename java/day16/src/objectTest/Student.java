package objectTest;

public class Student {
	//필드
	String name;
	int javaScore;
	int dbmsScore;
	int total;
	
	//생성자
	public Student(String name, int javaScore, int dbmsScore, int total) {
		super();
		this.name = name;
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.total = total;
	}
	
	//toString메소드 오버라이딩
	@Override
	public String toString() {		//toString을 잘 사용하면 객체의 정보를 잘 파악할 수 있다
		return "Student [name : " + this.name + ", javaScore : " + this.javaScore + "]";
	}
}
