package ex01;

import java.util.Scanner;

// 오현택
public class Main {
	//성적 평가 프로그램
	//학생의 성적을 2과목 입력받아 학점을 계산하는 프로그램
	//90점이상 A, 80점이상 90점 미만 B, 70점이상 80점 미만 C, 70점미만 F
	//반드시 메소드를 만들 것(2개 이상), 객체를 2개 만들 것 (학생1, 학생2)?
	
	//로직구성 있어야함
	
	//사용자로부터 점수를 입력받고 학점과 합격 여부를 출력하기
	//필드 : 이름, java점수, dbms점수, 총점, 학점
	//생성자 : 상관없음
	//메소드 : calculateGrade(int ) : 점수를 받아 학점 반환하는 메소드(매개변수1개 정수형)
	//		isPass(int ) : 점수가 70점이상이면 true, 아니면 false반환하는 메소드
	
	//1) Scanner import
	//2) 필드 작성
	//3) java, dbms점수 변수에 sc.nextInt()
	//4) 두개의 메소드 구현
	//5) 메인 메소드에 객체 생성 후 메소드호출
	
	String name;
	int javaScore;
	int dbmsScore;
	int sum;
	char grade;
	
	
	char calculateGrade(int avg) {
		if(avg>=90) {
			return 'A';
		} else if (avg>=80) {
			return 'B';
		} else if (avg>=70) {
			return 'C';
		} else {
			return 'F';
		}
	}
	
	boolean isPass(int avg) {
		if(avg>=70) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		
		int javaScore = 0, dbmsScore = 0, avg = 0;
		
		
		System.out.println("점수를 입력하세요");
		javaScore = sc.nextInt();
		dbmsScore = sc.nextInt();
		
		avg = Math.round((javaScore + dbmsScore)/2);
		
		System.out.println("학점 : " + m.calculateGrade(avg));
		System.out.println("합격유무 : " + m.isPass(avg));
		
	}
}
