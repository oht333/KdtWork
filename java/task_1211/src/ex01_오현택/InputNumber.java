package ex01_오현택;

import java.util.Scanner;

public class InputNumber {
	public static void main(String[] args) {
//		0) Scanner import
		Scanner sc = new Scanner(System.in);
		
//		1. 최소값과 최대값 출력
//		1) 필요한 변수 초기화
//		2) 정수입력하라는 문구 출력후 각 num에 sc.nextInt()
//		3) 삼항연산자를 통해 min, max 결정
//		4) 결과 출력
		int num1=0, num2=0, num3=0, max=0, min=0;
		
		System.out.println("3개의 정수를 입력하세요");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		min = (num1<num2&&num1<num3)?num1:(num2<num3)?num2:num3;
		max = (num1>num2&&num1>num3)?num1:(num2>num3)?num2:num3;

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

		
//		2. 5개 숫자의 평균을 소수점 2자리까지 출력
//		1) 필요한 변수 초기화
//		2) 합계를 구하고 3을 나눠 평균을 구한 후 강제형변환으로 avg에 대입
//		3) printf를 사용해서 소수점 2자리까지 출력
		int sum=0;
		double avg=0;
		sum = num1 + num2 + num3;
		avg = (double)sum / 3; 
		
		System.out.printf("평균 : %.2f", avg);
	}
	

}
