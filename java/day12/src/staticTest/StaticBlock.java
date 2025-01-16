package staticTest;

public class StaticBlock {
	
	public static void main(String[] args) {
		System.out.println("메인메소드 실행");
	}
	
	//정적블록 : 클래스가 로드될 때 먼저 실행된다(main메소드보다 먼저 출력)
	static {	//main메서드보다 먼저 실행된다
		System.out.println("클래스가 로드될 때 이 (정적)블록이 실행됩니다.");
	}
}
