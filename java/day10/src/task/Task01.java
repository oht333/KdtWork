package task;

import java.util.Scanner;

public class Task01 {

	/*
	//1. add 매서드 : for-each문을 이용하여 각 배열의 숫자들의 합을 res에 저장
	int add(int[] arr) {
		int res = 0;
		for(int data : arr) {
			res += data;
		}
		return res;
	}
	
	//2. subtract 매서드 : if문을 이용해 최대값과 최소값을 정해서 '최대값-최소값'으로 값을 구하기
	int subtract(int[] arr) {
		int max, min;

	    // 최대값과 최소값 구하기
	    if (arr[0] >= arr[1]) {
	        max = arr[0];
	        min = arr[1];
	    } else {
	        max = arr[1];
	        min = arr[0];
	    }

	    // 최대값에서 최소값을 뺌
	    return max - min;
	}
	
	//3. multiply 매서드 : for문을 이용해서 각 배열의 숫자들을 res(1)에 곱해서 res를 리턴
	int multiply(int[] arr) {
		int res = 1;
		for(int i=0; i<arr.length; i++) {
			res *= arr[i];
		}
		return res;
	}
	
	//4. divide 매서드 : [0]행 배열 / [1]행 배열 로 값을 구하기 
	double divide(int[] arr) {
		int numerator = arr[0];   // 분자
	    int denominator = arr[1]; // 분모
	    
	    return (double) numerator / denominator;
	}
	
	public static void main(String[] args) {
//		문제 1.
//		★메소드로 계산기 만들기★
//
//		사칙연산 실행
//		조건
//		1차원 2칸짜리 배열 생성
//		사용자로부터 입력 받고(int형) 배열에 저장(for문으로 저장)
//		메소드4개(더하기, 빼기, 곱하기, 나누기)
//		리턴타입 O, 매개변수 O (매개변수는 배열로 전달)
//		-> 더하기 메소드(for-each문 사용)
//		-> 빼기 메소드(큰값 - 작은값)
//		-> 곱하기 메소드(원하시는 대로)
//		-> 나누기 메소드(실수형으로 형변환. 0번 인덱스/1번 인덱스.
//		0으론 나눌 수 없음.)
//
		//1) Scanner import
		//2) Task01 객체 생성
		//3) arr라는 이름의 1X2 배열을 생성
		//4) 입력하라는 문구 출력
		//5) for문을 이용해서 각 열에 저장할 숫자들을 차례대로 입력
		//6) 메소드 4개를 불러와서 결과값 도출
		
		Scanner sc = new Scanner(System.in);
		Task01 t1 = new Task01();
		int[] arr = new int[2];
		System.out.println("각 배열에 저장할 정수를 입력하세요");
		
		for(int i=0; i<arr.length; i++) {			
			arr[i]=sc.nextInt();
		}
		
		System.out.println("배열에 있는 수를 합친 값 : " + t1.add(arr));
		System.out.println("배열에 있는 수를 뺀 값 : " + t1.subtract(arr));
		System.out.println("배열에 있는 수를 곱한 값 : " + t1.multiply(arr));
		System.out.println("배열에 있는 수를 나눈 값 : " + t1.divide(arr));
		*/
		
		
		
//		문제2. 
//
//		★메소드를 활용한 연령대별 버스카드 프로그램★
//
//		연령대를 입력받고(입력)
//		연령대를 판별한다(어린이, 청소년, 성인)(메소드1)
//		버스카드에 일정 금액 돈을 충전한다(입력)
//		버스카드를 사용(메소드2){  // int요금과 String연령대가 들어간다(매개변수 2개)
//		   연령대별 요금을 설정한다(final 변수)
//		   잔액 소진할 때까지 버스카드 사용(반복문)
//		   버스카드를 사용하는동안 "버스 탑승 완료." 출력
//		   "버스를 탑니다. 잔액 : " 출력
//		   잔액이 부족해지면 "잔액이 부족합니다." 출력하고 프로그램 종료(탈출)
//		   }
//
		Scanner sc = new Scanner(System.in);
		
		
		
//		문제3.
//		★메소드 회원가입★(메소드로 코드 분리하기)★
//
//		회원가입(입력 : 아이디, 닉네임, 비번, 비번확인)
//		→ 배열로 임의로 아이디와 닉네임 만들기(배열은 1차원 배열, 값은 각 3개)
//		→ 회원가입 시 배열에 있는 아이디를 사용한다고 하면 중복된다고 알려주기
//		→ 닉네임도 겹치면 알려주기
//		→ 비번은 두번 입력 받아 두개의 비번이 동일해야 하며, 아스키코드로 암호화
//		→ 겹치는거 없고, 비번도 다 맞으면 "회원가입 성공" 후 끝
//		→ 최종출력 "userName님 환영합니다, 아이디는 userId, 비밀번호는 암호화된 {아스키코드값} 입니다"
//		└ 배열, 메소드, for문, if문, 형변환
}

