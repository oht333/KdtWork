//오현택
package task;

import java.util.Scanner;

public class ArrayTask01 {

	public static void main(String[] args) {
		//배열문제 조건 1) 칸수만 알고있다고 가정
		//		조건 2) 반드시 length 사용
//				조건 3) 값을 대입하는 반복문, 값을 출력하는 반복문 각각 사용
		
		//1. 100~1까지의 값을 배열에 넣고 출력
		//일반 for문만 사용
		//1) int[] num 에 일단 100개의 배열을 선언
		//2) for문을 써서 num[i]을  i + 1 으로 담기
		//3) for문을 써서 num[j]를 출력
//		int[] num = new int[100];
//		
//		for(int i=0;i<100;i++) {
//			num[i] = i + 1;
//		}
//		
//		for(int j=0;j<100;j++) {
//			System.out.println(num[j]);
//		}
//		
//		System.out.println("=====================================");
		
		//2. 1~10까지의 값을 배열에 넣고 총 합 구하기
		//일반 for문만 사용
		//1) 1번문제의 2)까지 동일
		//2) 총합 sum을 초기화 해주고, for문에서 num2.length까지 '+='을 계산하기
		//3) sum 출력
//		int[] num2 = new int[10];
//		
//		for(int i=0;i<10;i++) {
//			num2[i] = i + 1;
//		}
//		
//		int sum = 0;
//		
//		for(int j=0;j<num2.length;j++) {
//			sum += num2[j];
//		}
//		
//		System.out.println("1부터 10까지의 총 합 : " + sum);
//		
//		System.out.println("=======================================");
		
		//3. 사용자에게 4개의 숫자를 입력받고 입력받은 값을 배열에 저장한 후 배열의 평균 구하기
		//일반 for문, for-each문 상관없음
		//1) 정수4개배열을 선언
		//2) for문을 사용해서 arr[i]의 배열값들을 nextInt()입력메소드 설정
		//3) for each문을 통해 sum 구하기
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 4개 입력하세요");
//		
//		int[] arr = new int[4];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int sum = 0;
//		
//		for (int num1 : arr) {
//            sum += num1; // 배열 요소의 합
//        }
//		
//		System.out.println("총 합 : " + sum);
		
		
		
		
		//4. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 값을 배열에 담고 출력
		//출력시 for-each문 사용
		//1) 정수10개비열 선언
		//2) for문을 통해 %5를 사용하면 0-4까지 반복될 수 있음
		//3) for-each문을 통해 출력
//		int[] arr = new int[10];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = i%5;
//		}
//		
//		for (int num : arr) {
//			System.out.println(num + " ");
//		}
		
		//5. A~F까지를 C만 제외하고 배열에 담아 출력
		//일반 for문
		//초기식 int i = 0;
		//1) 정수5개배열 선언
		//2) for문을 이ㅇㅇ해서 A부터 C까지 순차적으로 출력
		//3) if문, continue를 통해 C 건너뛰기
		//4) for each문 통해 배열값 순차적으로 출력
		
//		char[] arr = new char[5]; 
//        int index = 0;
//
//        for (int i=0;i<6;i++) {
//            char ch = (char) ('A' + i); 
//            if (ch == 'C') {
//                continue; 
//            }
//            arr[index++] = ch; 
//        }
//
//        // 배열 출력
//        for (char num1 : arr) {
//            System.out.print(num1 + " ");
//        }
		
		
		//6. aBcDeFgHiJkLmNoPqRsTuVwXyZ를 순서대로 배열에 담아 출력
		
		//1) 우선 소문자 형태로 알파벳 전부를 출력하자 (char)a 부터 시작해서 점점 1을 더하자
		//2) 여기서 if로 i가 짝수이면 대문자로 바뀌게끔 하자(ForTask01.java에 있는 문제와 동일)
//		int num = 0;
//		char ch = 'a';
//		for (int i = 0; i < 26; i++) { 
//			char res = 'A';
//			if(i%2==0) {
//				res = (char)(ch + i); 
//			}else {
//				res = (char)(ch + i - 32); 
//			}
//			System.out.print(res);
//        }
		
		
		//7. 5개의 정수를 입력한 뒤 배열에 담고 최소값과 최대값 출력하기
		//일반 for문
		//1) Scanner import
		//2) 배열 선언
		//3) "5개의 정수를 입력하세요 : " 출력
		//4) for문 이용해 각배열값에 sc.nextInt()
		//5) 최소값 최대값 초기화
		//6) if문을 이용해 최대 최소 찾기
		//7) 결과출력
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//
//        System.out.println("5개의 정수를 입력하세요 : ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int min = arr[0];
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        System.out.println("최소값 : " + min);
//        System.out.println("최대값 : " + max);
        
		//8. 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력받아
		// 입력된 사물함의 비밀번호와 설정한 비밀번호를 비교하여 일치 여부 출력하기
		//1) Scanner import
		//2) 4개의 비밀번호를 저장할 배열 선언
		//3) 설정하라는 문구 출력
		//4) for문을 사용하여 비밀번호 차례대로 각 사물함 비번 설정 sc.nextInt()
		//5) 사물함 번호 (lockernumber) sc.nextInt()
		//6) if문 써서 1-4번 사물함 번호 이외의 번호 return
		//7) 사물함 번호 골랐으면 해당 비밀번호 입력 sc.nextInt()
		//8) if문 사용해서 비밀번호 일치 확인
		
//		Scanner sc = new Scanner(System.in);
//		int[] pwd = new int[4];
//		System.out.println("사물함에 설정할 비밀번호를 입력하세요 (4개).");
//		
//		for(int i=0;i<pwd.length;i++) {			
//			System.out.print("사물함" + (i+1) + "의 비밀번호 : ");
//			pwd[i] = sc.nextInt();
//		}
//		
//		System.out.print("\n사용할 사물함 번호를 입력하세요 (1~10): ");
//        int lockerNumber = sc.nextInt();
//
//        if (lockerNumber < 1 || lockerNumber > 4) {
//            System.out.println("잘못된 사물함 번호입니다.");
//            return;
//        }
//
//        System.out.print("비밀번호를 입력하세요: ");
//        int enteredPwd = sc.nextInt();
//
//        // 비밀번호 확인
//        if (pwd[lockerNumber - 1] == enteredPwd) {
//            System.out.println("비밀번호가 일치합니다. 사물함을 사용할 수 있습니다!");
//        } else {
//            System.out.println("비밀번호가 일치하지 않습니다. 다시 시도하세요.");
//        }
        
		
        //////or
        
		
      //1) 5칸짜리 사물함의 비밀번호를 각각 배열에 저장한다
        //2) 사용자에게 이용할 사물함 번호를 묻는다
        //3) 비밀번호를 입력받아 확인한다
        //4) 일치/불일치를 출력한다
        
//		Scanner sc = new Scanner(System.in);
//		
//        int[] arPw = new int[5];
////        int[] arPw1 = {1111, 2222, 3333, 4444, 5555};
//        String mainMsg = "번 사물함의 비밀번호 설정 : ";
//        String choiceMsg = "이용할 사물함 번호 입력 : ";
//        String inputMsg = "비밀번호 입력 : ";
//        String result = null;
//        int choice = 0, inputPw = 0;
//        
//        for(int i = 0; i < arPw.length; i++) {
//           System.out.println(i + 1 + mainMsg);
//           arPw[i] = sc.nextInt();
//        }
////        for(int data : arPw) {
////           System.out.println(data);
////        }
//        
//        System.out.println(choiceMsg);
//        choice = sc.nextInt();
//        
//        System.out.println(inputMsg);
//        inputPw = sc.nextInt();
//        
//        if(arPw[choice - 1] == inputPw) {
//           System.out.println("비밀번호 일치");
//        }else {
//           System.out.println("비밀번호 불일치");
//        }
//        
        
		
		//9. 학생 1명의 3과목 총점과 평균(소수점 3자리)을 구하고 출력하기
		//	3과목은 배열에 입력받아 저장하며 for-each문만 사용(일반 for문 사용금지!!)
		//1) Scanner import
		//2) 3과목 점수 저장 배열 선언
		//3) 배열에 점수 입력nextInt() (이건 for문을 사용해야함)
		//4) 총점 계산 for-each문 사용
		//5) 평균 계산
		//6) 결과 출력
//		Scanner sc = new Scanner(System.in);
//
//        int[] scores = new int[3];
//        System.out.println("3과목 점수를 입력하세요:");
//
//        for (int i = 0; i < scores.length; i++) {
//            scores[i] = sc.nextInt();
//        }
//
//        int total = 0;
//        for (int score : scores) {
//            total += score;
//        }
//
//        double avg = (double) total / scores.length;
//
//        System.out.println("총점 : " + total);
//        System.out.printf("평균 : %.3f\n", avg);
		
        
        ////// or
        
        // 1) 입력클래스 import
        // 2) 3칸 배열 선언
        // 3) 합계 저장할 변수(int), 평균저장할 변수(double)
        // 4) 3과목의 점수 입력받는 for-each문
        // 5) 총점 계산할 for-each문
        // 6) 결과 출력(printf)

		Scanner sc = new Scanner(System.in);
		
        int[] scores = new int[3];
        int index = 0; // for-each문에서 사용하기 위한 변수
        int total = 0;
        double avg = 0.0;

//        System.out.println("3과목의 점수를 입력하세요 : ");
//        for(int i = 0; i < scores.length; i++) {
//           scores[i] = sc.nextInt();
//        }
//        
        for (int score : scores) {
           System.out.println("점수 입력 : ");
           score = sc.nextInt();
           scores[index++] = score;
        }

        for (int socre : scores) {
           total += socre;
        }

        avg = (double) total / scores.length;
        System.out.printf("총점 : %d\n", total);
        System.out.printf("총점 : %.3f\n", avg);

		
	}

}
