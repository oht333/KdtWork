package task1;

import java.util.Scanner;

//1. 숫자를 입력받아 1부터 입력받은 숫자까지의 합을 출력하는 프로그램을 만드세요. 
//그리고 숫자가 아닌 값이 입력될 경우 "잘못된 입력입니다"라는 예외 메시지를 출력하고, 
//프로그램을 종료하세요.

//사용자 정의 예외 클래스
class NotANumberException extends Exception {
	public NotANumberException(String msg) {
		super(msg);
	}
}

public class SumMain {
	//1) main메소드 생성
	//2) Scanner import
	//3) 입력숫자 초기화 후 일단 nextLine()으로 받기
	//4) validate()메소드를 생성 후 숫자가 아닐경우를 if문을 써서 예외처리할것(문제없으면 문자열로 받은것을 parseInt한걸 리턴값으로 지정 : static int validate(){})
	//		throw로 발생시키고 throws로 던지기
	//5) validate(입력값)을 int num으로 대입
	//6) for문에서 조건식에 입력숫자를 넣어서 합을 출력할 것
	//7) 입력받는 것부터 for문을 돌리고 결과가 나오는것까지 try catch를 적용
	//8) catch : NotANumberException 사용
	//9) finally : sc.close();
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, sum = 0;
        String str= " ";

        System.out.print("숫자를 입력하세요 : ");

        try {
        	str = sc.nextLine(); 
            num = validate(str); 

            // 1부터 num까지의 합 계산
            for (int i = 1; i<=num; i++) {
                sum += i;
            }

            System.out.println("합계 : " + sum);
        } catch (NotANumberException e) {
            System.out.println(e.getMessage()); 
        } finally {
            sc.close(); // Scanner 닫기
        }
    }

    // 숫자 유효성 검사 및 변환 메서드
    static int validate(String str) throws NotANumberException {
        // 입력값이 숫자인지 확인
        for (int i = 0; i<str.length(); i++) {
        	//문자열의 각 단어쪼개기
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') { 
                throw new NotANumberException("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }
        
        // 숫자라면 정수로 변환
        return Integer.parseInt(str);
    }
}
