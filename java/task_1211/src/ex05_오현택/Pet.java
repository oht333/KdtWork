package ex05_오현택;

public class Pet extends Animal {
//    Animal 추상 클래스를 상속받아 구현
//    생성자
//    name을 매개변수로 받아 초기화
//    메소드
//    void play() : 동물이 장난치는 행동을 출력
//    void eat() : 동물이 먹는 행동을 출력
//    void sleep() : 동물이 잠자는 행동을 출력
//    void performActions() : 위 세 메소드를 호출하여 행동을 출력
	//1) 요청사항 그대로 필드 및 생성자 만들기(단축키를 쓰면 편안함)
	//2) 각 메소드에 name을 이용해 출력문 만들기
	//3) abstract했던 메소드를 오버라이딩하고 각 만들었던 3개의 메소드를 호출
	public Pet(String name) {
		super(name);
	}

	void play() {
		System.out.println(name + "이/가 장난친다");
	}
	
	void eat() {
		System.out.println(name + "이/가 먹는다");
	}
	
	void sleep() {
		System.out.println(name + "이/가 잠잔다");
	}
	
	@Override
	void performActions() {
		play();
		eat();
		sleep();
	}

}
