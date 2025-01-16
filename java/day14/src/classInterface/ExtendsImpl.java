package classInterface;
//13번 : 상속과 구현은 별개이다

class Parent3{
	void parentMethod() {
		System.out.println("부모 클래스의 메소드");
	}
}

interface InterfaceA3{
	void methodA();
}

interface InterfaceB3{
	void methodB();
}

class Child3 extends Parent implements InterfaceA, InterfaceB{

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}
	
}



public class ExtendsImpl {

}
