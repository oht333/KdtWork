package task;

import java.util.Scanner;

public class TeamTask02 {		//Scanner 입력메소드, 나머지연산자, switch문

	public static void main(String[] args) {
//		Q3. 오늘의 운세 확인
//		---------로직---------
//		1. 입력받기 위한 Scanner 클래스 import
//		2. 메소드 사용을 위한 클래스 객체명 선언
//		3. 메세지 출력 후 이름 입력 받고 변수에 담기
//		4. 결과 출력 (메소드 사용)
//		5. 버퍼 비우기
		Scanner sc = new Scanner(System.in);
		TeamTask02 tt = new TeamTask02();
		System.out.print("이름을 입력하면 오늘의 운세를 확인 할 수 있습니다. : ");
		String name = sc.nextLine();
		System.out.println("운세 : " + tt.tellFortune(name));
		sc.close();
	}
	
//	Q3. 오늘의 운세 확인
//	이름을 입력하고 오늘의 운세를 확인해보세요
//	이름의 각 자리를 정수로 바꾼 후 다 더해서 5로 나누고 나온 나머지의 결과값에 따라 오늘의 운세 문구를 출력하세요 
//		[ 조건 ] 
//		1. 매개변수 o, 리턴값 o
//		2. 메소드명 : tellFortune
//		[운세 문구]
//		0 : 오늘은 행운의 날입니다!
//		1 : 약간의 어려움이 있을 수 있어요.
//		2 : 평온한 하루가 예상됩니다.
//		3 : 모험심을 발휘해보세요!
//		4 : 좋은 일이 찾아올 거예요.
//	---------로직---------
//	1. 기능 : 사용자로부터 입력받은 문자열에 각 자리를 정수로 형변환 후 총합한 결과에 5를 나눈 나머지값 구하고 운세 문구 반환
//	2. 매개변수 : String name
//	3. 메소드명 : tellFortune
//	4. 실행할 부분
//	    형변환한 이름의 각 자리를 담을 정수형 변수 unicodeSum
//	    for (매개변수 문자열길이만큼 반복) {
//	    unicodeSum= 매개변수.charAt(i); }
//	    int 결과 = unicodeSum % 5;} 
//	    switch (결과)
//	    0~4 : 각 숫자에 맞는 운세 문구
//	5. 리턴 값 : 문자열(운세문구)
//	6. 리턴타입 : String으로 변경
	String tellFortune(String name) {
        int unicodeSum = 0;
        for (int i = 0; i < name.length(); i++) {		//이름의 각 글자의 아스키코드
            unicodeSum += name.charAt(i);
        }
        int result = unicodeSum % 5;					//나머지 1, 2, 3, 4를 통해 case 출력
        
        switch (result) {
            case 1: return "약간의 어려움이 있을 수 있어요.";
            case 2: return "평온한 하루가 예상됩니다.";
            case 3: return "모험심을 발휘해보세요!";
            case 4: return "좋은 일이 찾아올 거예요.";
            default: return "오늘은 행운의 날입니다!" ;
        }

	}

}
