package task;

import java.util.Scanner;

public class TeamTask {		//Scanner 입력메소드, while문, if문, 논리연산자(||) 후위감소(--), .charAt(i) .equals() 

	public static void main(String[] args) {	
//		Q2. 귀여운 척 금지
//		---------로직---------
//		1. 입력받기 위한 Scanner 클래스 import
//		2. 메소드 사용을 위한 클래스 객체명 선언
//		3. 메소드 리턴 값을 담을 변수와 기회 횟수를 카운트 해줄 변수 선언 및 초기화
//		4. while (기회가 남아있을 때까지) {
//		    출력메세지 및 입력받은 값 변수에 담기
//		    메소드 사용하고 리턴 받은 값 변수에 담기
//		    ① if (키워드 o && 기회 > 0) 
//		    “당신은 귀엽습니다” 출력;
//		    기회변수—;
//		    ② else if (키워드 x) 
//		    “잘하고 있습니다, 앞으로도 그렇게 사용해주세요” 출력
//		    ③ else if (기회 == 0)
//		    “이제 그 만” 출력하고 반복문 종료;
//		5. 버퍼 비우기
		Scanner sc = new Scanner(System.in); 
		TeamTask tt = new TeamTask();        
		
		int flag = 0;  // 메소드 사용 리턴값을 담을 변수
		int count = 3; // 기회 3번                                             
		System.out.println("~냥 , ~용, ~쪄, ~냠 이 포함된 문장을 절대 입력하지마세요.");                     
	                                                                                 
		while (count >= 0) { // 기회가 남아있을 때까지 반복
			System.out.print("메세지 입력 : ");
			String cutePhrase = sc.nextLine(); 
			flag = tt.iAmCute(cutePhrase); // 변수에 메소드 리턴값 담기
			if (flag == 1 && count > 0) { // 키워드가 들어가 있다면 
				System.out.println("당신은 귀엽습니다 ><");
				count--; // 기회 차감
			} else if (flag == 0) { // 키워드가 들어가 있지 않다면              
				System.out.println("잘하고 있습니다, 앞으로도 그렇게 사용해주세요");
			} else if (count == 0) { // 키워드가 들어가 있고 기회도 없다면
					System.out.println(" 그 만 ");
					break; // 반복 탈출
			}
		}                                           
		sc.close();
	}
	
	
//	귀여운 척하는 사람의 말투를 고쳐줍시다.
//	조건에 부합하는 메소드를 작성해서 문장를 교정하세요.
//		[조건]
//		** 키워드 : ~냥 , ~냠, ~용, ~쪄
//		1. 매개변수 o, 리턴값 o (키워드 포함 여부를 담은 정수형 flag 변수 선언할 것)
//		2. 입력받은 문자열 중에 키워드가  있다면
//		해당 키워드를 2번 연속 출력하게 문장을 바꿉니다.
//		그 후 "당신은 귀엽습니다" 문장을 다음 줄에 출력 합니다.
//		3. 만약 키워드가 포함되지 않았다면 "잘하고 있습니다, 앞으로도 그렇게 사용해주세요" 출력
//		4. 키워드가 들어간 문장이 총 3번 이상 입력 되었을때 “그  만!” 문장을 출력시키고 프로그램을 종료시킵니다.
//		5. 메소드 명 : iAmCute
//			[출력 결과]
//			메세지 입력 : 안녕하세용
//			안녕하세용용
//			당신은 귀엽습니다 > <
//			메세지 입력 : 안녕하세용
//			안녕하세용용
//			당신은 귀엽습니다 > <
//			메세지 입력 : 안녕하세용
//			안녕하세용용
//			메세지 입력 : 안녕하세용
//			그   만 !
//	---------로직---------
//	1. 기능 : 사용자로부터 입력받은 문자열에 특수한 키워드 검사
//	2. 매개변수 : String cutePhrase
//	3. 메소드명 : iAmCute
//	4. 실행할 부분
//	    문자열을 쪼개서 저장할 한 글자 변수, 검사한 문자열 결과값을 다시 담을 변수
//	    리턴할 키워드 포함 여부를 담을 변수 선언 및 초기화
//	    for (매개변수 문자열길이만큼 반복) {
//	    	한 글자 변수 = 매개변수.charAt(i) + “”;
//		    if (한 글자 변수.equals(키워드)){
//		    결과값 += (한 글자 변수 + 한 글자 변수);
//		    여부 변수 = 1;
//		    } else { 결과값 += 한 글자 변수; } }
//	    	결과값 출력;
//	5. 리턴 값 : flag (정수형)
//	6. 리턴타입 : int로 변경
	int iAmCute(String cutePhrase) {
		String foo = "";
		String result = "";
		int flag = 0;

		for (int i = 0; i < cutePhrase.length(); i++) {
			foo = cutePhrase.charAt(i) + "";
			if (foo.equals("냥") || foo.equals("용") || foo.equals("냠") || foo.equals("쪄")) {
				result += (foo + foo);		//입력한 값에 귀여운 워딩이 한번더 붙여지게 된다
				flag = 1;
			} else {
				result += foo;				//입력한 값 그대로 나온다
			}
		}
		System.out.println(result);			//결과값 출력
		return flag;						//사망플래그 생존:0 사망:1
	}

}
