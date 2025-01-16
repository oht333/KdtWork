package classInterface;
//9번 : 클래스 단일상속

class Parent{
	void display() {
		System.out.println("부모클래스");
	}
}

//class Parent2{
//	void display0() {
//		System.out.println("부모클래스2");
//	}
//}

class Child extends Parent{	//여기서 Parent2도 extends 뒤에 추가를 하면 에러난다
	void display2() {
		System.out.println("자식클래스");
	}
}

public class ClassMain {
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
		c.display2();
	}
}
