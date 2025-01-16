package ex05_오현택;

public abstract class Animal {
//	필드
//    String name : 동물 이름 (protected)
//    생성자
//    이름을 매개변수로 받아 초기화
//    메소드
//    String getName() : 동물의 이름을 반환
//    void performActions() : 추상 메소드, 동물의 행동을 출력
	//1) 요청사항 그대로 필드 및 생성자, 메소드 만들기(단축키를 쓰면 편안함)
	//2) 메소드 앞에 abstract붙이고 뒤에 구현부는 삭제
	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	abstract void performActions();
	
}
