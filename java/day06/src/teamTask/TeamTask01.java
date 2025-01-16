package teamTask;

import java.util.Scanner;

public class TeamTask01 {

	public static void main(String[] args) {
	   // 1. 케이스 4 케이스 3 케이스 2 케이스 1 : 제발제발제발 뽑히지말아주세요 제소원입니다. 부탁드립니다. 어떻게 좀 해주세요 제발요
	   // 
	   Scanner sc = new Scanner(System.in);		//입력클래스 import
	   
	   int suggest = 0;			//정답제시
	   final int ANSWER = 30;	//정답	   
	   int count = 0;			//시도횟수
	   
	   while (count<3) { 						// count가 2보다 작을때 실행되는 반복문  0, 1, 2
		   System.out.println("숫자를 맞추세요");	// 출력메소드
		   suggest = sc.nextInt();				// 입력메소드
		   
		   if(suggest > ANSWER) {			// 제시한 답안이 정답보다 클 때
			   System.out.println(suggest + "보다 작습니다.");	//정답이 제시한 답안보다 작습니다
			   count++;		//count 증가
		   }else if (suggest < ANSWER) {	// 제시한 답안이 정답보다 작을때
			   System.out.println(suggest + "보다 큽니다.");	//정답이 제시한 답안보다 큽니다
			   count++;		//count 증가
		   }else {
			   System.out.println("정답입니다!");	//정답일때
			   break;		//정답인 경우 반복문을 벗아남
		   }
	   };
	   
	   sc.nextLine();
	   System.out.println("프로그램이 종료되었습니다.");	//종료메시지 출력
   
    //2. OX 퀴즈 (2문제   > 1번 못 맞추면 프로그램 종료
	//   > 1번 맞추면 2번 문제로 넘어가기)
	//2-1) 아기화장품은 순해서 어른들이 사용해도 괜찮다? (X)
	//2-2) 독사가 자기 혀를 깨물면 죽는다? (O))
//		   Scanner sc = new Scanner(System.in);
//		   System.out.println("문제를 맞춰주세요");
//		   System.out.println("첫번째 문제입니다. 아기화장품은 순해서 어른들이 사용해도 괜찮다?");
//		   int num1 = sc.nextInt();
	   
	      String answer = ""; // 사용자가 입력한 입력값을 받을 변수를 선언 (String으로)

	      System.out.println("OX 퀴즈가 시작됩니다. 맞으면 다음문제로 넘어가고 틀리면 종료됩니다.\n"); // OX 퀴즈가 시작한다는 안내를 출력

//		      Scanner sc = new Scanner(System.in); // 입력 메소드 import

//		         1번문제) 아기화장품은 순해서 어른들이 사용해도 괜찮다?
	      System.out.println("1번문제 : 독사가 자기 혀를 깨물면 죽는다?"); // 1번 퀴즈 메세지 출력 (출력 메소드) 
	      
	      answer = sc.nextLine(); // 1번 문제 답의 입력 메소드 

	      if (answer.equals("X")) {
	         System.out.printf("틀렸습니다 (문제종료)"); // 1번 문제 답 : if 조건식 , if~else >> 를 사용하여 답이 출력 되게 하고, 
	      } else if (answer.equals("O")) {         //             틀리면 문제 종료, 맞으면 2번 문제로 넘어가는 조건으로 진행 되게함
	         System.out.printf("맞습니다 (2번문제 넘어갑니다)\n"              
	               + "\n2번문제 : 아기화장품은 순해서 어른들이 사용해도 괜찮다?"); // 2번 문제 출력 메소드 입력

	         answer = sc.nextLine();                  // 2번 문제 또한 if 조건식 , if~else >> 를 사용하여 답이 출력 되게 하고
	         if (answer.equals("X")) {               // 모든 문제를 맞추면 축하 메세지와 함께 문제 종료, 틀려도 문제 종료
	            System.out.println("\n축하드립니다. 모든 문제를 맞줬습니다. \nOX퀴즈가 종료됩니다.");
	         } else if (answer.equals("O")) {
	            System.out.println("틀렸습니다 (문제종료)");

	         }
	      }
	}

}
