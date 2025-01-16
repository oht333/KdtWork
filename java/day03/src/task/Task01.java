package task;

public class Task01 {
   public static void main(String[] args) {
       //1. 기본 자료형의 변수를 선언하고 초기화한 뒤 값을 출력하기
      int num = 100000;
      long num2 = 123456789L;
      float num3 = 3.14f;
      double num4 = 3.14159265359;
      char a = 'A';
      boolean isTrue = true;
      System.out.println(num);
      System.out.println(num2);
      System.out.println(num3);
      System.out.println(num4);
      System.out.println(a);
      System.out.println(isTrue);
      System.out.println("========================");
//      출력결과 예시
//      int: 100000
//      long: 123456789L
//      float: 3.14f
//      double: 3.14159265359
//      char: A
//      boolean: true
      
      //2. 이름과 생년월일을 저장할 상수를 선언하고 출력하기
      final String name = "오현택";
      final int birth = 910719;
      
      System.out.println("제 이름은 " + name + "이고 생년월일은 " + birth + "입니다");
      System.out.println("========================");
//      출력결과
//      제 이름은 000이고 생년월일은 000000입니다
      
      //3. 아래 변수를 선언하고 변수의 데이터 타입과 값을 출력하기
      
      int age = 25;
      float height = 160.5f;
      boolean isStudent = true;
      
      System.out.println("나이 : " + age + ", 타입은 Integer형");
      System.out.println("키 : " + height + ", 타입은 Float형");
      System.out.println("나이 : " + isStudent + ", 타입은 Boolean형");
      System.out.println("========================");
      
      // 정수형 age 변수 선언, 값 : 25
      // 실수형 height 변수 선언, 값 : 160.5
      // 논리형 isStudent 변수 선언, 값 : true
      
//      출력결과
//      나이 : 25, 타입은 000형
//      키 : 160.5, 타입은 000형
//      학생여부 : true, 타입은 000형
      
      //4. hobby라는 문자열 변수 선언 후 값을 초기화하여 출력하기(printf 한번만 사용)
      
      String hobby;
      hobby = "영화감상";
      System.out.printf("안녕하세요, 제 이름은 %s입니다.\n제 취미는 %s입니다.", "오현택", hobby);
      System.out.println("\n========================");
//      출력결과
//      안녕하세요, 제 이름은 [000]입니다.
//      제 취미는 [00]입니다.
      
      //5. 아래 변수를 선언하고 각 자료형 변환을 수행하여 결과 출력하기
      String strNum = "100";
      int intNum = 200;
      double doubleNum = 300.5;
      char charLetter = 'C';
      boolean boolVal = true;
      
      System.out.println(intNum + Integer.parseInt(strNum));
      System.out.println((double)intNum + doubleNum);
      int asciiVal = charLetter;
      System.out.println(asciiVal);
      String res = boolVal + "";
      System.out.println(res);
//      strNum을 정수로 변환하여 덧셈 연산 : intNum + strNum
//      intNum을 실수로 자동 형변환하여 덧셈 연산 : intNum + doubleNum
//      charLetter를 정수로 변환하여 출력
//      boolVal을 문자열로 변환하여 출력
      
   }
   
}
