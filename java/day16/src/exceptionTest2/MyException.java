package exceptionTest2;
//7번 : 사용자 정의 예외 클래스
public class MyException extends Exception {	//Exception : 컴파일 확인하는 예외, RuntimeException : 컴파일이 확인하지 않아서 실행해야만 발생하는 예외
	public MyException() {
		super("음수는 입력하면 안돼요");
	}
}
