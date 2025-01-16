package anonymousTest;
//4번 : 익명클래스
public class Main {
	public static void main(String[] args) {
		ClassA ca = new ClassA();
//		InterA ia = new ClassA();	//업캐스팅
//		InterA ia2 = new InterA();   //구현되어있는 메서드가 없어서 사용불가능
		
		InterA ia = new InterA() {		

			@Override					//InterA:부모클래스, 임시클래스:자식클래스
			public void printData() {
				System.out.println("익명클래스에서 메소드 오버라이딩");
			}
			
		};
		
//		InterA는 인터페이스 : 부모(상위타입)
//		인터페이스를 구현한 클래스는 모두 InterA를 부모로 둔다
//		인터페이스는 객체를 생성할 수 없어서 익명클래스를 통해 인터페이스의 메소드를 구현하고 객체로 생성할 수 있다
		
//		익명클래스 : 자식클래스(하위타입)
//		익명클래스는 InterA 인터페이스를 자동으로 implements 한것과 동일
//		익명클래스는 작성된 시점에 생성된 하나의 구체적인 클래스로 동작한다
//		이 클래스는 인터페이스의 메소드를 반드시 구현해야한다
		
//		업캐스팅
//		익명클래스의 인스턴스는 인터페이스 InterA타입의 변수에 저장된다(업캐스팅)
//		즉, 자식클래스 타입(익명클래스)을 부모클래스(InterA)의 참조변수 ia에 저장한 상태이다
		
//		ia 참조변수
//		타입이 InterA, 익명클래스 객체는 인터페이스 타입의 참조변수에 저장된다
//		부모타입으로 참조하고 있지만 실제 메소드 호출시에는 오바라이딩 된 자식클래스의
//		메소드가 실행된다(다형성)
		
//		Cannot instantiate the type InterA
//		구현되지 않은(미완성된) 메소드가 있기 때문에 객체 생성 불가능하다
//		구현되지 않은 것을 구현 해주면 객체를 생성할 수 있다
			
		System.out.println(ia);	//확인해보면 $가 있는데 이는 '내부클래스'를 의미함 (그 뒤의 숫자는 클래스가 이름이 없기때문에 임의로 1,2,3,4...이렇게 붙여진거임)
		ia.printData();			//부모타입에 항상 자식이 들어가면 '업캐스팅'이라고 생각할 것
	}
}
