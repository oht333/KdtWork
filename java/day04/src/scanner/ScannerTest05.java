package scanner;

import java.util.Scanner;

//6번 : nextInt()

public class ScannerTest05 {

	public static void main(String[] args) {
		
		//나이(nextInt), 이름(nextLine)을 입력받기
		
		//1. 변수 2개 선언(int, String)
		
		//2. 입력 클래스 import
		//3. 출력 메세지 (나이 입력 : )
		//4. 변수 = nextInt()
		//5. 출력메세지(이름 입력 : )
		//6. 변수 = nextLine()
		//7. 출력(이름은 000이고 나이는 0살입니다)
		
		int age = 0;
		String name = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		sc.nextLine();	//nextInt를 하고 그다음 nextLine을 쓸거면 그전에 한번 더 nextLine을 써서 버퍼에 있는걸 소모시켜야한다
		System.out.println("이름 입력 : ");
		name = sc.nextLine();
		System.out.println("이름은 " + name + "이고 나이는 " + age + "살 입니다.");
		sc.close();
	}

}
