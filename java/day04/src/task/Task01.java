package task;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		//1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기
		
		//로직
		//0) Scanner import
		Scanner sc = new Scanner(System.in);
		
//		//1-1) 100000원이 넘는 금액 과 결과값들 초기화
//		int price = 0, res1 = 0, res2 = 0, res3 = 0, res4 = 0, rest1 = 0, rest2 = 0, rest3 = 0, rest4 = 0;
//		//1-2) 질문 출력
//		System.out.println("100000원이 넘는 금액을 입력하세요");
//		price = sc.nextInt();
//		//1-3) 각각 금액을 나눈 결과값 
//		res1 = price / 50000;
//		rest1 = price % 50000;
//		res2 = rest1 / 10000;
//		rest2 = rest1 % 10000;
//		res3 = rest2 / 5000;
//		rest3 = rest2 % 5000;
//		res4 = rest3 / 1000;
//		rest4 = rest3 % 1000;
//		
//		//1-4) 각각 금액을 나누고 나머지 값
//		
//		System.out.println("5만원 : " + res1 + "개");
//		System.out.println("나머지 : " + rest1);
//		System.out.println("1만원 : " + res2 + "개");
//		System.out.println("나머지 : " + rest2);
//		System.out.println("5천원 : " + res3 + "개");
//		System.out.println("나머지 : " + rest3);
//		System.out.println("1천원 : " + res4 + "개");
//		System.out.println("나머지 : " + rest4);
		
		
		//2. 키와 몸무게를 입력받아 BMI를 계산하기
		// 공식 : 몸무게 / (키 * 키)
		
//		//2-1) 키와 몸무게를 입력받는 변수 선언 및 입력메소드 만들기
//		System.out.println("키와 몸무게를 입력하세요");
//		int height = 0, weight = 0;
//		height = sc.nextInt();
//		weight = sc.nextInt();
//		
//		//2-2) BMI계산을 변수에 저장
//		double bmi = (double)weight / (double)(height * height);
//		
//		//2-3) 출력
//		System.out.println("BMI : " + bmi);
		
		
		//3. 밑변과 높이를 입력받아 삼각형의 높이 계산하기
		//공식 : 0.5 * 밑변 * 높이
//		// 3-1) 입력하라는 문구를 출력하세요
//		System.out.println("밑변과 높이를 입력하세요");
//		// 3-2) 밑변과 높이를 입력받는 변수 선언 및 입력메소드 만들기
//		int width = 0, height = 0;
//		width = sc.nextInt();
//		height = sc.nextInt();
//		// 3-3) 넓이 구하는 공식을 변수에 저장
//		double result = (double)(width * height) / 2;
//		System.out.println("결과값 : " + result);
		
		
		//4. 두 정수를 입력받아 0보다 큰지 출력하기(true or false로 출력할 것)
//		//4-1) 입력하라는 문구를 출력하세요
//		System.out.println("두 수를 입력하세요");
//		//4-2) 두 수를 초기화 및 입력메소드 만들기
//		int num1 = 0, num2 = 0;
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		//4-3) 관계연산자를 통해 비교하기
//		System.out.println("num1이 0보다 크니? " + (num1 > 0));
//		System.out.println("num2이 0보다 크니? " + (num2 > 0));
		
		
		
		//5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		// 물건의 개수 : 3
		// 물건의 개당 가격 : 15000
		// 총액 : 금액원
//		//5-1) 입력하라는 문구를 출력하기
//		System.out.println("물건의 개수 및 개당 가격을 차례대로 입력하세요");
//		//5-2) 두 수를 초기화 및 입력메소드 만들기
//		int qty = 0, price = 0;
//		qty = sc.nextInt();
//		price = sc.nextInt();
//		//5-3) 총액을 구하는 변수 만들기
//		int sum = qty * price;
//		//5-4) 결과값 출력
//		System.out.println("총액 : " + sum + "원");
		
		//6. 두자리수 정수를 입력받아 각 자리의 숫자를 더하여 출력하기(각 자리수의 합)
		//6-1) 입력하라는 문구를 출력하기
//		System.out.println("두자리수 정수를 입력하세요");
//		//6-2) 각 자리의 숫자를 계산하기
//		int num = 0;
//		num = sc.nextInt();
//		int res1 = num / 10;
//		int res2 = num % 10;
//		//6-3) 각 자리의 숫자를 더하는 값을 선언 및 출력
//		int res3 = res1 + res2;
//		System.out.println("각 자리의 숫자 합 : " + res3);
		
		//7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
//		//true or false
//		//7-1) 입력하라는 문구를 출력하기
//		System.out.println("정수를 입력하세요");
//		//7-2) 입력할 정수 초기화 및 입력메소드
//		int num = sc.nextInt();
//		//7-3) 0보다 크면 양수이고 2로 나누어서 나머지가 0이면 짝수
//		boolean res = ((num>0) && (num%2==0));
//		System.out.println("양수이면서 짝수인가? " + res);
		
		
		//8. 두 숫자를 입력받아 첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부를 출력하기
		//true or false
//		//8-1) 입력하라는 문구를 출력하기
//		System.out.println("두 정수를 입력하세요");
//		//8-2) 입력할 정수 초기화 및 입력메소드
//		int num1 = 0, num2 = 0;
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		//8-3) 비교연산자를 통해 결과도출
//		System.out.println("첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같나? " + (num1 >= num2));
		
		//9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
		//true or false
//		//9-1) 입력하라는 문구를 출력하기
//		System.out.println("두 숫자를 입력하세요");
//		//9-2) 입력할 정수 초기화 및 입력메소드
//		int num1 = 0, num2 = 0;
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		//9-3) 비교, 논리연산자 사용해서 결과도출
//		System.out.println((num1>0 && num2<=0) || (num1<=0 && num2>0));
		
		
		// 10. 연도를 입력받아 윤년인지 아닌지 출력하기(2024년, 2025년도로 확인할 것)
	      // true or false => ture이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다로 출력
	      // 윤년 계산 : 연도가 4로 나누어떨어지고 100으로 나누어떨어지지 않거나 400으로 나누어떨어져야한다
	      
	      //1) 변수 선언 int 1개, boolean 1개
	      //2) 출력메시지
	      //3) 연도 입력받기
	      //4) boolean 타입 변수 윤년 여부 계산 
	      //5) 출력
	      
	      int year = 0;
	      boolean result3 = false;
	      System.out.println("연도를 입력하세요 : ");
	      year = sc.nextInt();
	      result3 = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	      System.out.println(result3);
//	      System.out.println(year + "는 윤년입니다");
//	      System.out.println(year + "는 윤년이 아닙니다");
	      
	      System.out.println(result3 ? year + "는 윤년입니다" : year + "는 윤년이 아닙니다");
	      sc.close();
	}

}
