package abstractTest1;
//2번 : 추상 클래스
public abstract class classB {		//추상메소드가 하나라도 존재하면 반드시 추상클래스로 선언해야한다
	//추상메소드
	abstract void method1();
	
	//일반메소드
	void method2() {
		System.out.println("추상클래스의 method2() 호출");
	}
}
