package ex04_오현택;

public class Person {
//    - 필드 (private) : String name(학생 이름)
//    - 생성자 : 이름을 매개변수로 받아 초기화
//    - 메소드
//        getName() : name 필드의 값을 반환
	
	//1) 요청사항 그대로 필드 및 생성자, 메소드 만들기(단축키를 쓰면 편안함)
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
