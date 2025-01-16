package practice;

import java.util.Random;
import java.util.Scanner;

public class Task {
	//  **문제 3. 랜덤다이스 만들기**
	//  주사위를 돌려서 같은 수 두 번이 나올 때 까지 던진다. 몇번째에 성공하는지 횟수를 계산해야 하고, 메서드에 이름을 입력하면 그 사람의 결과가 출력된다
	//  "연속으로 같은 수 나오기 성공"
	//  "김태현님은 총 몇 번 성공하셨습니다" 출력
	//  메소드명은 randomDice, 리턴값은 없음, 매개변수는 문자열 변수 사용   
	 
	// *** 메소드 로직
	// ** 기능 : 주사위 1개를 던져서 연속으로 나오는 숫자가 동일할 때 반복 종료하고 몇 번 반복을 돌렸는지까지 같이 출력
	// 1) 리턴 타입 void
	// 2) 메소드명 randomDice
	// 3) 매개변수 (String name)
	// 4) 코드 
	//    2가지 결과를 비교할 변수 2개(int dice, diceTemp), 회수를 누적할 변수(int count) 선언 및 초기화
	//    Random random = new Random(); → 주사위값을 랜덤으로 받기 위해 클래스 사용→
	//    while (true) {
	//       dice = (random.nextInt(6) + 1);
	//       if (diceTemp == 0) {   // 처음 주사위 던졌을 땐 비교값이 0
	//          diceTemp = dice;   → 이전 주사위 결과와 비교해야 돼서 임시로 저장
	//       } else if (dice != diceTemp) { // 임시 저장한 값과 새 주사위 값이 불일치라면
	//          count++;   횟수 증가
	//       } else {
	//          횟수를 포함한 결과출력;
	//          break; }
//	 void randomDice (String name) {
//	    int dice = 0, diceTemp = 0, count = 0;
//	    Random random = new Random();
//	    while (true) {
//	       dice = (random.nextInt(6) + 1);
//	       if (diceTemp == 0) {
//	          diceTemp = dice;
//	       } else if (dice != diceTemp) {
//	          diceTemp = dice;
//	          count++;
//	       } else {
//	          System.out.printf("연속으로 같은 수 나오기 성공\n%s님은 총 %d번 성공하셨습니다", name, count);
//	          break;
//	       }
//	    }
//	 }
	 void randomDice (String name) {
		 int dice = 0, diceTemp = 0, count = 0;			//dice : 현 주사위 숫자, diceTemp : 전에 시도한 주사위 숫자 count : 시도 횟수
		 Random random = new Random();					//1~6까지 랜덤의 숫자를 구하기 위해 Random클래스를 사용
		 while (true) {
			 dice = (random.nextInt(6) + 1);			//0-5사이의 랜덤숫자
			 if (diceTemp == 0) {
				 diceTemp = dice;
			 } else if (dice != diceTemp) {
				 System.out.println("결과 : " + dice + ", " + diceTemp);
				 diceTemp = dice;
				 count++;
				 System.out.println("실패, 시도:"+count+"번");
				 System.out.println("--------------------");
			 } else {
				 System.out.println("결과 : " + dice + ", " + diceTemp);
				 System.out.printf("연속으로 같은 수 나오기 성공!\n%s님은 총 %d번째에 성공하셨습니다", name, count+1);
				 break;
			 }
		 }
	 }
	
	 public static void main(String[] args) {
//   3번 문제 메인메소드 로직
//   1. Scanner 클래스 import
//   2. 메소드 사용하기 위해 클래스명 객체화
//   3. 이름 변수 선언 및 초기화 후 이름 입력받기
//   4. 메소드 사용(이름 인수로 전달)
//   5. 버퍼 비우기
		 
	   Scanner sc = new Scanner(System.in);
	   Task t = new Task();
		 String name3 = "";
		 System.out.print("이름 입력 : ");
		 name3 = sc.next();
		 t.randomDice(name3);
		 sc.close();
	 }
		
}

