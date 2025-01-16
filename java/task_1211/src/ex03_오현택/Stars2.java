package ex03_오현택;

import java.util.Scanner;

public class Stars2 {
	public static void main(String[] args) {
		//0) Scanner import
		//1) 출력하고 싶은 행을 입력해야하니 num을 초기화하고 sc.nextInt()
		//2) 2중 for문을 사용해서 입력하는 숫자(num)에따라 행이 나오게끔 첫째 for문 작성 
		//3) 별이 한개씩 증가하고 있으니 i+1으로 구현을 할 것 System.out.print() 사용
		//4) 마지막으로 행을 끊어주는 System.out.println(); 사용
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		System.out.print("출력하고 싶은 행을 입력 : ");
		num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
