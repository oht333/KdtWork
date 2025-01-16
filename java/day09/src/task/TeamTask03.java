package task;

import java.util.Scanner;

public class TeamTask03 {		//사용한 기능 : if문, for문, 복합할당연산자(*=)

	public static void main(String[] args) {
//		Q1. 좀비 바이러스 발생
//		---------로직---------
//		1. 입력받기 위한 Scanner 클래스 import
//		2. 메소드 사용을 위한 클래스 객체명 선언
//		3. 초기 좀비 수를 입력받기 위해 메세지 출력하고 초기 좀비 수 입력받아 변수에 담기
//		4. if (좀비 <= 1) {
//			"초기 진압 되었습니다." 출력
//		5. } else { 결과값(메소드 사용)을 출력 }
//		6. 버퍼 비우기
		Scanner sc = new Scanner(System.in);
		TeamTask03 tt = new TeamTask03();
		
		System.out.print("최초 좀비의 수는 몇명이었나요? ");
		int zombie = sc.nextInt();
		if (zombie<= 1) {
			System.out.println("초기 진압 되었습니다.");			//1마리 뿐이여서 초기진압
		} else {
			System.out.println("6시간 후의 좀비의 수는 : " + tt.calculatorZombie(zombie) + " 입니다.");        
		}
		sc.nextLine();    
		
		System.out.println();	// 줄바꿈

	}

//	처음 좀비의 수가 2마리 라고 가정했을 때 1시간 후에는 4마리 > 2시간 후에는 8마리 > 3시간 후에는 16마리> ... 가 됩니다.
//	6시간 뒤에 좀비가 몇 마리가 될지 계산하는 메소드를 만드세요.
//		[조건]
//		1. 리턴값 o, 매개변수 o
//		2. 초기 좀비의 수는 입력메소드로 입력 받아야합니다
//		3. 초기 좀비의 수가 1로 입력 받았을 경우 ‘초기 진압 되었습니다.’ 출력
//			[출력 결과] 6시간 후의 좀비의 수는  N 입니다.**
//	---------로직---------
//	1. 기능 : 사용자로부터 입력받은 초기 좀비 수에 6승의 결과값을 구하는 메소드
//	2. 매개변수 : int zombie
//	3. 메소드명 : calculatorZombie
//	4. 실행할 부분
//	    리턴할 총 좀비수 변수 선언
//	    제곱 연산이기 때문에 선언한 변수에 초기 좀비 값 대입
//	    for (6시간이라 6번 반복) {
//	    총 좀비 수 *= 초기 좀비 수; }
//	5. 리턴 값 : 총 좀비 수 (int)
//	6. 리턴타입 : int로 변경
	int calculatorZombie(int zombie) {
		int zombieTotal = zombie;	// 제곱을 계산해야하기 때문에
									// 반복문 실행 전 초기값을 초기 좀비수로 잡아줌
		for (int i = 1; i <= 6; i++) { // 총 6번의 반복을 돌려 6승을 계산
			zombieTotal *= zombie; // 누적 곱셈 (제곱)
		}                             
		return zombieTotal; // 누적 곱셈한 총 좀비 수 반환
	}
	
}
