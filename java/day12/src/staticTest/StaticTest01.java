package staticTest;
//2번: 정적메소드와 인스턴스 메소드
public class StaticTest01 {
	public static void main(String[] args) {
		StaticTest01.staticMethod();
//		StaticTest01.instanceMethod1(); 에러가 뜸
		
		//같은 클래스에 있는 static메소드는 메소드명으로만도 호출가능
		staticMethod();
		
		//인스턴스 메소드를 호출하기 위해 객체 생성
		StaticTest01 st = new StaticTest01();
		//정적메소드를 호출하지만 권장하지 않음
		st.staticMethod();
		
		//인스턴스 메소드 호출
		st.instanceMethod1();
		st.instanceMethod2();
	}
	


	//인스턴스 메소드1
	void instanceMethod1() {
		System.out.println("인스턴스메소드1 실행");
		instanceMethod2();
		staticMethod();		//static메소드는 이미 만들어져있어서 인스턴스매서드에서도 사용가능하지만
	}
	
	//인스턴스 메소드2
	void instanceMethod2() {
		System.out.println("인스턴스메소드2 실행");
	}
	
	//정적 메소드
	static void staticMethod() {
		System.out.println("정적 메소드 실행");
//		instanceMethod1(); //인스턴스 메소드는 객체가 올라가야만 생성이 되니까 static메서드에서는 호출 불가
		
		//static메소드는 static끼리만 사용가능
	}
	
}
