package print;
//8번 : 출력메소드(printf)

public class PrintTest02 {

	public static void main(String[] args) {
		//정수형
		int num1 = 200;
		System.out.printf("10진수 : %d\n", 100);	//10진수 값 출력
		System.out.println();
		System.out.printf("\n10진수 : %d", num1);	//10진수 값 출력
		System.out.printf("\n8진수 : %o", 8);		//숫자 '8'을 8진수로 나타낸 값은 '10'이다. 
		System.out.printf("\n8진수 : %o", 377);		// 8진수 571 값 출력
		System.out.printf("\n16진수 : %x", 0xff);		// 16진수 값
		System.out.printf("\n16진수 : %x", 10);		// 10 => a, 15 => f
		System.out.printf("\n16진수 : %x", 26);		// 1a
		
		//실수형
		System.out.printf("\n실수형 : %f", 3.1234567);	//소수점이하 6자리까지 정확히 나옴 7자리 이상되면 7번째 자리에서 반올림
		System.out.printf("\n실수형 소수점 5자리까지 : %.5f", 3.123456);	//소수점 5자리(.5)로 하게되면 반올림해서 나타나진다.
		
		//문자형
		System.out.printf("\n문자형 : %c", 'a');
		System.out.printf("\n문자형 : %c", 'A');
		
		//문자열
		System.out.printf("\n문자열 : %s", "hello");
		String data = "hello, java";
		System.out.printf("\n문자열 : %.5s", data);	// 문자열에서 .n 형태를 쓰게 되면 해당 자리수까지만 문자열이 잘라서 출력된다
		
		//논리형
		System.out.printf("\n논리형 : %s", true);
		
		//복합 사용
	      int age = 20;
	      String name = "오현택";
	      double date = 11.25;
	      boolean isStudy = true;
	      System.out.printf("\n이름 : %s, 나이 : %d, 오늘날짜 : %.2f, 공부중여부 : %s", name, age, date, isStudy);

		
	}
}
