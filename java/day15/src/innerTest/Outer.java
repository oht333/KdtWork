package innerTest;
//1번 : 내부클래스
public class Outer {
	//Outer 클래스의 필드
	int var1;
	String data1 = "Outer";
		
	//Outer 클래스의 기본 생성자
	public Outer() {
		System.out.println("외부 클래스 생성자");
	}
	
	//내부클래스 Inner 정의
	class Inner{
		//필드, 생성자, 메소드
		//Inner 클래스의 필드
		int var2 = 10;
		String data2 = "Inner";
		
		//Inner 클래스의 생성자
		public Inner() {
			super();
			System.out.println("내부 클래스의 생성자");
		}
		
		//Inner 클래스의 메소드
		void innerMethod() {
			System.out.println("내부클래스의 메소드 호출");
			var1 = 10;
			//this.var1 = 10;	//inner인스턴스 내부클래스의 var1이라는 뜻인데 내부클래스 안에는 var1이 없다
			System.out.println("내부클래스의 메소드에서의 var1의 값 : " + var1);
			outerMethod();		//내부클래스의 메소드에서 외부클래스메소드를 호출하는거 가능
		}
		
	}
	
	//메소드
	void outerMethod() {
		System.out.println("외부클래스의 메소드 호출");
		System.out.println(var1);
	}
}
