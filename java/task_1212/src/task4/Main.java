package task4;

import java.util.Scanner;

//4. 사용자로부터 숫자를 입력받아, 입력받은 숫자가 3의 배수인 경우 "Fizz", 
//5의 배수인 경우 "Buzz", 3과 5의 공배수인 경우 "FizzBuzz", 
//그 외의 경우에는 입력받은 숫자를 출력하는 프로그램을 작성하세요. 
//사용자가 문자열을 입력할 경우, "숫자가 아닌 문자열이 입력되었습니다"라는 예외 메시지를 출력하세요.

//사용자 정의 예외 클래스
class NotNumberException extends Exception {
    public NotNumberException(String msg) {
        super(msg);
    }
}

public class Main {
	//1) main 메소드 생성
	//2) Scanner import
	//3) String str로 문자열 입력받기
	//4) validate메소드 생성해서 문자라면 예외처리 숫자면 parseInt 시키기
	//5) validate()로 만든 정수형 변수 num으로 if문으로 원하는 문자 출력
	//6) try catch문
	//7) finally -> sc.close()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = " ";

        System.out.print("숫자를 입력하세요: ");

        try {
        	str = sc.nextLine();
            int num = validate(str);

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("입력한 숫자: " + num);
            }
        } catch (NotNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }

    static int validate(String str) throws NotNumberException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NotNumberException("잘못된 입력입니다. 숫자를 입력해주세요.");
        }
    }
}
