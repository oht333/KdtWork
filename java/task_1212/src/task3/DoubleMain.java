package task3;

import java.util.Scanner;

//3. 사용자로부터 정수를 입력받아, 입력받은 정수가 0에서 100 사이의 값인 경우, 
//입력받은 정수를 2배한 값을 출력하고, 그 외의 값이 입력될 경우 
//"잘못된 입력입니다"라는 예외 메시지를 출력하세요.

//1) Scanner import
//2) 정수형 변수 만들어서 입력받기
//3) if else문 통해 조건만족하면 *2
//4) 아닌경우 예외발생하게하고 예외클래스 작성
//5) try catch 작성하고 마지막 sc.close()

class NotValidNumberException extends Exception{
	public NotValidNumberException(String msg) {
		super(msg);
	}
}

public class DoubleMain {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int num = 0;

        try {
            System.out.print("정수를 입력하세요: ");
            num = sc.nextInt();

            if (num >= 0 && num <= 100) {
                System.out.println("결과값 : " + (num * 2));
            } else {
                throw new NotValidNumberException("1부터 100까지만 입력가능합니다");
            }
        } catch (NotValidNumberException e) {
            System.out.println(e.getMessage());
        } finally {
        	sc.close();
        }
    }
}
