package scanner;

import java.util.Scanner;

//3번 : next()와 nextLine()
public class ScannerTest03 {

	public static void main(String[] args) {
		
		//1. 입력클래스 import
		Scanner sc = new Scanner(System.in);
		
		//next, nextLine 차이점 : Enter를 소모하고 소모하지 않는 차이
		
		//2. 출력메세지
		System.out.println("입력 : ");
		
		//3-1. sc.next() : 엔터를 임시저장공간에서 소모하지 않는다
//		System.out.println(sc.next());
//		System.out.println(sc.next());
//		System.out.println(sc.next());
		
		//3-2. sc.nextLine() : 엔터를 임시저장공간에서 소모한다
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
	}

}
