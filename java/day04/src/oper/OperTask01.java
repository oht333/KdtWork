package oper;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
		
		
		//1. 사용자로부터 두개의 숫자를 입력받아 두 숫자의 합과 곱을 각각 출력하기
		
		//로직구성
		//0) Scanner import
		Scanner sc = new Scanner(System.in);
		//1-1) 두개의 숫자 선언 후 nextInt()작성
		System.out.println("두 숫자를 입력하세요");
		
		int num1 = 0, num2 = 0;
		num1 =sc.nextInt();
		num2 =sc.nextInt();
		
		//1-2) 결과값 출력하기
		System.out.println("두 숫자의 합 : " + (num1 + num2));
		System.out.println("두 숫자의 곱 : " + num1 * num2);
		sc.nextLine();	// 버퍼 비우기
		
		
		//2. 1번에서 입력받은 두개의 숫자를 사용하여 평균을 계산하고 소수점 두자리수까지 출력하기
		double avg = (double)(num1+num2)/2;
		System.out.printf("두 숫자의 평균 : %.2f", avg);
		
		//3. 두자리수 정수를 입력받고 십의자리와 일의자리를 출력하기
		//3-1) 두자리수 정수를 입력하는 변수 선언 (String)
		System.out.println("두자리 수를 입력하세요");
		String num3 = "";
		num3 = sc.nextLine();
		
		//3-2) String num3의 첫째문자(십의자리)와 둘째문자(일의자리)를 carAt()을 이용하여 출력
		char res1 = num3.charAt(0);
		char res2 = num3.charAt(1);
		System.out.println("십의자리 : " + res1);
		System.out.println("일의자리 : " + res2);
		
		
		
	
		//입출력 결과
		//두 자리수 정수를 입력하세요 : 
		//십의자리는 _입니다. 일의 자리는 _입니다.
		
		//4. 코인노래방 프로그램 만들기, 사용자에게 금액을 입력받고 부를 수 있는 곡수와 잔돈 출력하기
		//한 곡의 가격은 400원 입니다
		
	}
}
