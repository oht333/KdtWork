package constructorThis2;

public class Person {
   // 필드
   String name;
   int age;

   // 생성자
   // 기본생성자
   public Person() {

   }
   
   // 이름만 매개변수로 받는 생성자
   public Person(String name) {
      this(name, 10);
      System.out.println("이름의 매개변수를 받는 생성자가 호출되었습니다");
   }

   // 모든 필드의 매개변수를 받는 생성자
   public Person(String name, int age) {
      this.name = name;
      this.age = age;
   }


   // 메소드
   // printInfo() 정보 출력
   void printInfo() {
      System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
      this.greet();		//메소드안에 다른 메소드도 실행하고 싶으면 '객체.매소드명()'을 써야하니 this.메소드명()으로 하면 된다
      greet();			//같은 클래스안이니까 그냥 메소드명()을 사용해도 된다 하지만 명시적으로 어떤 객체인지를 알려주는게 좋으니까 this붙여서 사용하자. (가독성 증가)
   }

   // greet() 이름 님 안녕하세요 출력
   void greet() {
      System.out.println(this.name + "님 안녕하세요");
   }

}
