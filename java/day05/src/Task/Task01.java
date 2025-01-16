package Task;

import java.util.Scanner;

public class Task01 {
   public static void main(String[] args) {
      
//      1. 한개의 정수를 입력받아 짝수인지 홀수인지 출력하기
//      입력 : 8
//      출력 : 짝수입니다
	   //0) Scanner import
//	   Scanner sc = new Scanner(System.in);
	   //1-1) 정수를 입력하는 문구 작성
	   //1-2) num1 초기화 및 입력메소드 적용
	   //1-3) num1을 2로 나눌때 나머지가 0이니 if문 써서 짝수 홀수 구분하기
//	   System.out.println("한개의 정수를 입력하세요");
//	   int num1 = 0;
//	   num1 = sc.nextInt();
//	   if(num1%2==0) {
//		   System.out.println("짝수입니다");
//	   } else {
//		   System.out.println("홀수입니다");
//	   }
	   
	   
//      2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기
//      입력 : -5
//      출력 : 음수입니다
	   
//      입력 : 100
//      출력 : 양수입니다
//
//      입력 : 0
//      출력 : 0입니다
//
	   //2-1) num1 초기화
	   //2-2) 입력하라는 문구 출력
	   //2-3) num 입력메소드
	   //2-4) if조건식을 써서 양수, 0, 음수 일때 출력하기
//	   int num1 = 0;
//	   System.out.println("한개의 정수를 입력하세요");
//	   num1 = sc.nextInt();
//	   if(num1>0) {
//		   System.out.println("양수입니다");
//	   }else if(num1==0) {
//		   System.out.println("0입니다");
//	   }else {
//		   System.out.println("음수입니다");
//	   }
	   
//      3. 나이를 입력받아 다음 기준으로 출력하기
//         0~12: 어린이
//         13~19: 청소년
//         20 이상: 성인
//
//      나이입력 : 16
//      청소년입니다
	   
	   //3-1) int age 초기화
	   //3-2) 입력하세요 문구 출력
	   //3-3) age 입력메소드
	   //3-4) if 조건문을 써서 나이에 따른 결과값 출력
//	   int age = 0;
//	   System.out.println("나이를 입력하세요");
//	   age = sc.nextInt();
//	   if(age>0 && age<=12) {
//		   System.out.println("어린이입니다");
//	   }else if(age>=13 && age<=19) {
//		   System.out.println("청소년입니다");
//	   }else {
//		   System.out.println("성인입니다");
//	   }	   
	   
//      4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기(단, 삼항연산자만 이용할 것)
//         입력 : 5 1 9
//         출력 : 1 5 9
	   //4-1) 세 개의 정수 초기화
	   //4-2) 입력하라는 문구 출력
	   //4-3) 세 개의 정수 입력메소드
	   //4-4) 최대값 구하기
	   //4-5) 최소값 구하기
	   //4-6) 전체합의 최대값, 최소값 빼서 중간값 구하기
	   //4-7) 순서 출력
//	   int num1 = 0 , num2 = 0, num3 = 0;
//	   System.out.println("세 개의 정수를 입력하세요");
//	   num1 = sc.nextInt();
//	   num2 = sc.nextInt();
//	   num3 = sc.nextInt();
//	   
//	   int max = num1>num2 && num1>num3 ? num1 : num2>num3 ? num2 : num3;
//	   int min = num1<num2 && num1<num3 ? num1 : num2<num3 ? num2 : num3;
//	   int mid = (num1 + num2 + num3) - max - min;
//	   
//	   System.out.println(max + " > " + mid + " > " + min);
	   
//      5. 사용자로부터 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지를 출력하고 그 외에는 입력한 문자열을 출력하기
	   //5-1) 입력값(answer) 초기화
	   //5-2) 입력하라는 문구 출력
	   //5-3) answer 입력메소드 적용
	   //5-4) if조건문에서 .equals()사용해서 출력 및 종료 작성
//	   String answer = "";
//	   System.out.println("문자를 입력하세요");
//	   answer = sc.nextLine();
//	   
//	   if(answer.equals("X")) {
//		   System.out.println("종료되었습니다.");
//	   } else {
//		   System.out.println(answer);
//	   }
//
//      6. 사용자가 입력한 숫자에 해당하는 구구단을 출력하기
//      단을 입력하세요 : 3단
//      출력
//      3 x 1 = 3
//      3 x 2 = 6
//      ...
//      3 x 9 = 27
	   //6-1) num1 초기화
	   //6-2) 입력하라는 문구 출력
	   //6-3) num1 입력메소드 적용
	   //6-4) for문 사용해서 반복하기
//	   int num1 = 0;
//	   System.out.println("숫자를 입력하세요");
//	   num1 = sc.nextInt();
//	   
//	   for(int i=1;i<=9;i++) {
//		   System.out.println(num1 + " X " + i + " = " + (num1*i));
//	   }
//
//      7. ATM 메뉴에서 입금, 출금, 잔액 조회를 구현하세요.
//
//      [조건]
//      초기 잔액은 10000원으로 설정
//      메뉴에서 선택에 따라 작업 수행
//      종료 시 프로그램 종료
//
//      String msg =  "\nATM 메뉴의 번호를 선택하세요 : "
//                  + "1. 잔액 조회"
//                  + "2. 입금"
//                  + "3. 출금"
//                  + "4. 종료"
//                  + "선택 : ";
	 //7-1) 초기금액 price 지정
	 //7-2) msg 작성
	 //7-3) 일단 while을 통해 true를 지정해서 계속 반복되게끔 만들고 '종료'할때 false상태로 되게끔하기
	 //7-4) 잔액조회 case1 작성
	 //7-5) 입금 case2 작성 (잘못된 숫자의 경우 다시 작성하게끔 if문으로 구분해서 입금하는거 구현
	 //7-6) 출금 case3 작성 (case2 참고해서 작성하고, 만약 남은잔액을 초과할 경우 다시 작성하게끔 if문 사용)
	 //7-7) 종료 case4 작성 (여기서 switch를 false 상태로 바꾸게 해서 반복문 중단)
	 //7-8) default 작성
//	 int price = 10000;
//	 
//     String msg =  "ATM 메뉴의 번호를 선택하세요 : "
//     + "1.잔액조회"
//     + " 2.입금"
//     + " 3.출금"
//     + " 4.종료"
//     + "\n선택 : ";
//     
//     boolean running = true;
//
//     while (running) {
//         System.out.print(msg);
//         int choice = sc.nextInt(); 
//
//         switch (choice) {
//             case 1: // 잔액조회
//                 System.out.println("현재 잔액 : " + price + "원");
//                 break;
//
//             case 2: // 입금
//                 System.out.print("입금할 금액을 입력하세요: ");
//                 int deposit = sc.nextInt();
//                 if (deposit > 0) {
//                	 price += deposit;
//                     System.out.println(deposit + "원이 입금되었습니다. 잔액: " + price + "원");
//                 } else {
//                     System.out.println("다시 입력하세요.");
//                 }
//                 break;
//
//             case 3: // 출금
//                 System.out.print("출금할 금액을 입력하세요: ");
//                 int withdrawal = sc.nextInt();
//                 if (withdrawal > 0 && withdrawal <= price) {
//                	 price -= withdrawal;
//                     System.out.println(withdrawal + "원이 출금되었습니다. 잔액: " + price + "원");
//                 } else if (withdrawal > price) {
//                     System.out.println("잔액이 부족합니다. 잔액: " + price + "원");
//                 } else {
//                     System.out.println("다시 입력하세요.");
//                 }
//                 break;
//
//             case 4: // 종료
//                 System.out.println("프로그램을 종료합니다.");
//                 running = false;
//                 break;
//
//             default: // 잘못된 입력 처리
//                 System.out.println("다시 입력하세요.");
//         }
//     }
   }
}
