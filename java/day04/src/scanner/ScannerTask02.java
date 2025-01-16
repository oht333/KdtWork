package scanner;

import java.util.Scanner;

//7번 : 입력메소드 실습
public class ScannerTask02 {

	public static void main(String[] args) {
		// 1. 사용자로부터 세 개의 숫자를 입력받아 합을 출력하는 프로그램
		// - 세개의 숫자를 각각 입력받기
		// - 세 숫자의 합을 계산하여 출력
		// - 세 숫자의 합은 00입니다 형식으로 출력하기
		
		//로직구성
		//0) 입력클래스 불러오기
		Scanner sc = new Scanner(System.in);
		
		//1-1) 세 개의 숫자를 입력하게 처리
		System.out.println("세 개의 숫자를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//1-2) 합계의 변수를 선언해서 입력한 세 개의 숫자를 더해 저장하기
		int sum = num1 + num2 + num3;
		
		//1-3) "세 숫자의 합은 00입니다" 형식으로 출력
		System.out.println("세 숫자의 합은 " + sum + " 입니다.");
		
		
		System.out.println("==================================================");
		// 2. 사용자로부터 일어난 시간(정수), 아침, 점심, 저녁에 할 일과 잠들 시간(정수)을 입력받아 출력하기
		// - 일어날 시간과 아침, 점심, 저녁에 할일, 잠들 시간을 각각 입력받기
		// - 순서대로 입력받고 출력할것
		// - 출력 형식
		// 오늘 일어난 시간은 00시이고 잠들 시간은 00시 입니다
		// 아침 : 00하기
		// 점심 : 00하기
		// 저녁 : 00하기
		
		//2-1) 일어날 시간 입력
		System.out.println("일어난 시간을 입력하세요(숫자)");
		int wakeTime = sc.nextInt();
		sc.nextLine();
		
		//2-2) 할일들을 각각 입력
		System.out.println("아침에 할일은?");
		String morningTodo = sc.nextLine();
		System.out.println("점심에 할일은?");
		String lunchTodo = sc.nextLine();
		System.out.println("저녁에 할일은?");
		String nightTodo = sc.nextLine();
		
		//2-3) 잠들 시간 입력
		System.out.println("잠들 시간을 입력하세요(숫자)");
		int sleepTime = sc.nextInt();
		
		//2-4) 출력하기
		System.out.println("오늘 일어난 시간은 " + wakeTime + "시이고 잠들 시간은 " + sleepTime + "시 입니다");
		System.out.println("아침 : " + morningTodo + "하기");
		System.out.println("점심 : " + lunchTodo + "하기");
		System.out.println("저녁 : " + nightTodo + "하기");
		
		System.out.println("==================================================");
		//3. 물건가격이 10000원이다. 사용자로부터 지불금액을 입력받아 거스름돈을 계산하기(뺄셈 - 이용)
		// 출력형식
		// 물건 가격은 10000원입니다
		// 지불가격을 입력하세요 : 00
		// 거스름돈은 3000원입니다
		
		//3-1) 지불가격 입력하게 하기
		System.out.println("물건 가격은 10000원입니다");
		System.out.print("지불가격을 입력하세요 : ");
		int pay = sc.nextInt();
		
		//3-2) 거스름돈 계산로직을 change 변수에 넣기
		int change = pay - 10000;
		
		//3-3) 결과값 출력
		System.out.println("거스름돈은 " + change + "원입니다.");
		
		sc.close();
		
	}

}
