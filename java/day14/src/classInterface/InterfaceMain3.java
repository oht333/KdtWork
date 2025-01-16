package classInterface;
//12번 : 인터페이스의 다중 상속 (각각의 역할을 분리해서 써야할때 다중 상속을 사용한다)
// 객체가 여러 역할을 수행해야할 때
// 모듈화와 확장성을 고려할 떄
// 재사용성과 중복 방지

interface InterfaceA2{
	void methodA();
}

interface InterfaceB2{
	void methodB();
}

interface InterfaceC extends InterfaceA2, InterfaceB2{
	void methodC();
}

class ClassA2 implements InterfaceC{

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceMain3 {
	public static void main(String[] args) {
		
	}
}
