package staticTest;
//3번 : 정적 변수와 정적메소드
public class MyClassB {
	public static void main(String[] args) {
		//1. 인스턴스 변수 출력 => 객체 생성 필수
		MyClassA a = new MyClassA();
		MyClassA aa = new MyClassA();
		System.out.println(a.instanceVar);	//0(기본값)
		
		//2. 정적 변수 출력 => 객체 생성으로 접근 가능하나 권장하지 않음x  (클래스에 객체를 만들때는 구분을 위해 여러개 만들지만, static은 구분이 되지 않음)
		//클래스명.정적변수명으로 접근한다!!!
		System.out.println(MyClassA.staticVar);	//0(기본값)
		
		
		//이렇게 사용하면 a, aa를 다른 객체라고 오해할 수 있는데 결국 static변수는 동일하다 그러니 권장하지 않음
//		a.staticVar = 10;
//		System.out.println(a.staticVar);
//		aa.staticVar = 30;
//		System.out.println(aa.staticVar);
//		System.out.println(a.staticVar);
		
		//3. 다른 클래스에서 인스턴스 메소드 호출
		a.instanceMethod1();
		
		//4. 다른 클래스에서 스태틱 메소드 호출
		MyClassA.staticMethod1();	//객체명(a)로 쓰지말고 클래스명.메소드 로 출력할 것!
	}
}
