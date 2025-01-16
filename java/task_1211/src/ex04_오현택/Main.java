package ex04_오현택;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//1) Scanner import
		//2) 이름 및 점수들 초기화
		//3) "이름을 입력하세요"출력
		//4) name = sc.next();
		//5) 점수를 입력하라는 문구출력, 각 점수들 sc.nextInt()
		//6) 이제까지 만들었던 Person, Student에 대한 객체 만들고 입력했던 변수들을 인수로 지정
		//7) void타입으로 만들었으니 sysout하고 각 클래스의 메소드를 불러오면 출력 완료
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		int num1=0, num2=0, num3=0;
		System.out.println("이름을 입력하세요");
		name = sc.next();
		
		System.out.println("세 과목 점수를 각각 입력하세요");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		Person p = new Person(name);
		Student stu = new Student(num1, num2, num3);
		
		System.out.println("이름 : " + p.getName());
		System.out.println("평균 : " + stu.getAverageScore() + "점");
		
		sc.close();
	}
}
