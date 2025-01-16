package homework;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
//		0) Scanner import
		Scanner sc = new Scanner(System.in);
		
//		공백(0100)                                                           
//		문제 1. 사용자가 입력한 숫자까지 구구단을 출력하는 프로그램
//		   구구단은 1단부터 9단까지다.
//		   사용자가 4를 입력할 경우 1단부터 4단까지 아래와 같은 형식으로 출력한다. 단은 \t로 구분한다.
//		   (이중 for 문 사용, if 사용 X)
//
//		[입출력예시]
//		구구단을 어디까지 출력할까요? : 4
//		1 * 1 = 1   2 * 1 = 2   3 * 1 = 3   4 * 1 = 4   
//		1 * 2 = 2   2 * 2 = 4   3 * 2 = 6   4 * 2 = 8   
//		1 * 3 = 3   2 * 3 = 6   3 * 3 = 9   4 * 3 = 12   
//		1 * 4 = 4   2 * 4 = 8   3 * 4 = 12   4 * 4 = 16   
//		1 * 5 = 5   2 * 5 = 10   3 * 5 = 15   4 * 5 = 20   
//		1 * 6 = 6   2 * 6 = 12   3 * 6 = 18   4 * 6 = 24   
//		1 * 7 = 7   2 * 7 = 14   3 * 7 = 21   4 * 7 = 28   
//		1 * 8 = 8   2 * 8 = 16   3 * 8 = 24   4 * 8 = 32   
//		1 * 9 = 9   2 * 9 = 18   3 * 9 = 27   4 * 9 = 36
		
//		1) num 초기화
//		2) 숫자 입력하라는 문구 출력
//		3) num 출력메소드
//		4) for문의 for문을 이용해서 입력한 숫자의 단까지 출력
		
//		문제 1 답
//		int num = 0;
//		
//		System.out.println("숫자를 입력하세요");
//		
//		num = sc.nextInt();
//		
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i + " * " + j + " = " + (i*j));				
//			}
//			System.out.println();
//		}
//		
//		sc.nextLine();
//		sc.close();
		
//		문제 2 : 점심 선택 및 가격 확인
//	   사용자로부터 점심 메뉴를 입력받아 해당 메뉴와 가격을 출력하기
//	   - 점심 메뉴 4가지에서만 가능하다
//	      짜장 (5000원), 돈까스 (8000원), 피자 (25000원), 햄버거 (6000원)
//	   - 올바른 메뉴를 입력할 때까지 반복합니다.
//	   - 잘못된 메뉴를 입력하면 다시 입력받습니다.
		
//		1) 메뉴제시 문자열변수 초기화
//		2) while문 계속작동하는 boolean 변수 초기화
//		3) while문 안
//			3-1) "메뉴를 입력하세요" 출력
//			3-2) 메뉴제시 변수 입력메소드 적용
//			3-3) 메뉴제시 답변에 따른 각 case 경우 구현 (마지막 break하기)
//			3-4) default(다른답변할시) 다시 입력하라는 문구와 continue;
//			3-5) switch문 끝난 후 break; 
		
//		문제 2 답
//		String ask = " ";
//		
//		boolean running = true;
//		
//		while(running) {
//			
//			System.out.print("메뉴를 입력하세요 : ");
//			ask = sc.nextLine();
//			
//			switch(ask) {
//			case "짜장" : 
//				System.out.println(ask + "(5000원)");
//				break;
//				
//				
//			case "돈까스" : 
//				System.out.println(ask + "(8000원)");
//				break;
//				
//			case "피자" : 
//				System.out.println(ask + "(25000원)");
//				break;
//				
//			case "햄버거" : 
//				System.out.println(ask + "(6000원)");
//				break;
//			default :
//				System.out.println("다시 입력하세요");
//				continue;
//			}
//			
//			break;
//		}
		
		
//		문제 3 : 문자의 아스키코드 값 확인
//		사용자로부터 문자를 입력받아 아스키코드 값을 확인하고 입력받은 문자를 아스키코드 값으로 변환한다
//		사용자가 입력한 문자와 그 아스키코드를 출력하는데 반복문을 사용하여 여러번 입력받도록 한다
//		'A'를 입력하면 종료하고 종료 메시지를 출력한다

		//1) char 선언
		//2) "문자를 입력하세요. 'A'를 입력하면 종료합니다." 출력
		//3) while 문
//			3-1) 입력메소드 생성
//			3-2) if문 써서 입력메소드의 글자수가 한글자가 아닌경우 "다시 입력하세요"와 함께 continue
//			3-3) 'A'일때 종료
//			3-4) 강제형변환을 이용한 asciiValue 생성
//			3-5) 답 출력
//		3번 정답
		char inputChar;

        System.out.println("문자를 입력하세요. 'A'를 입력하면 종료합니다.");

        while (true) {
            System.out.print("입력: ");
            String input = sc.nextLine();

            if (input.length() != 1) {
                System.out.println("한 글자만 입력해주세요.");
                continue;
            }

            inputChar = input.charAt(0); 

            if (inputChar == 'A') { 
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int asciiValue = (int) inputChar; 
            System.out.println("입력한 문자: " + inputChar + ", 아스키코드 값: " + asciiValue);
        }

        sc.close();
		
	}

}
