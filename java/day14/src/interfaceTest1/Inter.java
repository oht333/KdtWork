package interfaceTest1;
//6번 : 인터페이스 선언
public interface Inter {
	//상수, 추상메소드
	public final static int VAR1 = 10;		// static : 처음부터 끝까지 메모리에 남아있는
	int VAR2 = 20;	//이렇게만 선언해도 앞에 public final static 이 붙어있다
	
	
	public abstract void method1();
	void method2(); //이것도 public abstract 가 앞에 붙어있는 것이다
}
