package casting3;
//7번 : 캐스팅의 특징
public class Animal {
   //필드
   String name;
   int age;
   
   //생성자
   public Animal(String name) {
      super();
      this.name = name;
   }

   //메소드
   void crying() { 
      System.out.println("울어");
   }
}