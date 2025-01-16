package scanner;
//5번 : 입력 메소드 실습

import java.util.Scanner;

//클래스명, 패키지명 바꾸기 단축키 : 좌측 패키지나 클래스 클릭 후 F2키 > 변경할 이름으로 입력후 엔터
public class ScannerTask01 {

	public static void main(String[] args) {

		// 두 정수를 입력받고 합을 출력하기
		// next 메소드를 사용한다
		// [입출력 결과]
		// 정수 1 입력 : 10
		// 정수 2 입력 : 20
		// 두 정수의 합은 30입니다.

		// 로직구성 먼저 진행!
		// 1. Scanner 클래스
		Scanner sc = new Scanner(System.in);

		// 2. 두 수를 변수선언해서 입력받는다
		System.out.println("두 수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();

		// 3. int 타입의 변수를 선언해서 두 수의 합을 넣도록 한다
		int sum = a + b;

		// 4. "두 정수의 합은 " + 변수 + "입니다." 출력
		System.out.println("두 정수의 합은 " + sum + " 입니다");

		// 5. sc.close() 하기
		sc.close();
	}
}
