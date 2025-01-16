package accessModifier;
//1번
public class Person {
	//필드
	private String name;	//private : 같은 클래스내에서만 접근 가능
	private int age;

	//setter 메소드 : name 필드의 값을 설정
	public void setName(String name) {	//public : 다른 클래스에서도 접근 가능
		this.name = name;
	}

	//getter 메소드 : name 필드의 값을 반환
	public String getName() {
		return name;
	}

	//메소드
	void printInfo() {
		System.out.println(this.name + "님 환영합니다!");
	}
}
