package task2;

import java.util.Scanner;
//2. 문자열을 입력받아, 입력받은 문자열을 정수로 변환하여 출력하는 프로그램을 작성하세요. 
//만약 입력받은 문자열이 숫자가 아닐 경우, NumberFormatException 예외가 발생하게 되며, 
//"숫자가 아닌 문자열이 입력되었습니다"라는 메시지를 출력하세요.

class NotANumberException extends Exception {
	public NotANumberException(String msg) {
		super(msg);
	}
}

public class ConvertMain {
	//1) main메소드 생성
	//2) Scanner import
	//3) String str = sc.nextLine();
	//4) 1번문제랑 똑같이 validate()메소드를 만들어 for문으로 문자열 쪼개서 숫자여부 조회
	//5) 리턴으로 parseInt한 값을 받음
	//6) throw, throws 적용
	//7) 결과값나오는 간단로직 작성후 try catch
	//8) finally로 sc.close()
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = " ";
		System.out.println("숫자를 적어주세요");
		
		try {
			str = sc.nextLine();
			validate(str);
			System.out.println("결과값 : " + str);
		} catch (NotANumberException e) {
			e.printStackTrace();
		} finally {
			sc.close();
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
