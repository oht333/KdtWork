package constructorThis1;
//8번 : 문제 해결
class Student1 {
   // 필드
   String name;
   int age;

   // 생성자
   public Student1(String name, int age) {
      this.name = name;
      this.age = age;
      System.out.println(this.name);
      System.out.println(name);
   }

   // 메소드
   void studentInfo() {
      System.out.println("이름 : " + name);
      System.out.println("나이 : " + age);
   }
}

public class StudentMain1 {
   public static void main(String[] args) {
      Student1 st = new Student1("신짱구", 5);
      
   }
}