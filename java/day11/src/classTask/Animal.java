package classTask;

//1. 동물 클래스를 작성하세요
//필드(속성) : '이름', '나이', '종류'라는 필드
//   - 이름 : 동물의 이름을 저장하는 곳
//   - 나이 : 동물의 나이를 저장하는 곳
//   - 종류 : 동물의 종류(개, 고양이, 새 등)를 저장하는 곳
//메서드(행동)
//   - 밥먹기() : 동물이 밥을 먹는 행동을 하는 메서드
//   - 놀기() : 동물이 노는 행동을 하는 메서드
//   - 자다() : 동물이 자는 행동을 하는 메서드
//   - 생일축하() : 동물의 생일을 축하하는 메서드


//1) 필드작성
//2) 필드에 있는 변수를 이용해서 각 매서드에 호출 출력문을 다르게 작성
public class Animal {
	String name;
	int age;
	String type;
	
	void eat() {
		System.out.println(type + " 인 " + name + "이 밥을 먹습니다");
	}
	
	void play() {
		System.out.println(type + " 인 " + name + "이 놀고 있습니다");		
	}
	
	void sleep() {
		System.out.println(type + " 인 " + name + "이 자고 있습니다");		
	}
	
	void celebrate() {
		System.out.println(name + "야 축하해. 이제" + age + "살이 되었네.");		
	}
}
