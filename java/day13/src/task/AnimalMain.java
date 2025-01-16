package task;

public class AnimalMain {
   public static void main(String[] args) {

//   Animal 클래스
//   부모클래스
//   필드: 없음
//   메소드: cry() (소리를 출력)
//   
//   Cat 클래스
//   부모클래스를 상속받는 자식클래스
//   필드: 없음
//   메소드: cry() 오버라이딩 (고양이 소리를 출력)
//      play() 스크래치 놀이를 합니다 출력
//      
//   Dog 클래스
//   부모클래스를 상속받는 자식클래스
//   필드: 없음
//   메소드: cry() 오버라이딩 (개 소리를 출력)
//      walk() 산책을 갑니다 출력
//   
//   Mouse 클래스
//   부모클래스를 상속받는 자식클래스
//   필드: 없음
//   메소드: cry() 오버라이딩 (쥐 소리를 출력)
//      sleep() 고양이를 피해 잠을 잡니다 출력
//      
//   AnimalMain 클래스
//   Animal 클래스의 객체 생성
//   각 클래스의 객체 생성
//   메소드 : main메소드
//   printCrying(Animal animal)메소드   
//      (조건문으로 instanceof 사용해서 해당 하는 것에 맞는 객체의 메소드가 사용되도록 진행-다운캐스팅 이용)
//   
//   (각 객체를 넣었을 때 결과 출력-어떤과정이 진행되었는지 주석달아 작성)

	   Animal animal = new Animal();
	   Animal cat = new Cat();
//	   Animal dog = new Dog();
	   Animal mouse = new Mouse();
	   
	   printCrying(cat);
//	   printCrying(dog);  //or
	   printCrying(new Dog()); //이렇게도 쓸 수 있다
	   printCrying(mouse);
	   
	   Animal[] ani = {new Cat(), new Dog(), new Mouse()};
	   System.out.println(ani);	//주소값
	   System.out.println(ani[0]);	//Cat의 주소값
	   
	   //공통메소드 호출 다운 캐스팅으로 고유 메소드 호출
	   for(Animal animal2 : ani) {
		   printCrying(animal2);
	   }
	   
   }
   
   static void printCrying(Animal animal) {
//	   if(animal instanceof Cat) {				//업캐스팅된 타입이 Cat이면 (Cat타입의 참조값이 들어왔을때)
//		   animal.cry();					//animal이 다운캐스팅 되고 오버라이딩 된 cry() 호출
//		   ((Cat)animal).play();				//animal이 다운캐스팅 되고 play() 호출
//	   } else if (animal instanceof Dog) {		//업캐스팅된 타입이 Dog이면
//		   ((Dog)animal).cry();					//animal이 다운캐스팅 되고 오버라이딩 된 cry() 호출
//		   ((Dog)animal).walk();				//animal이 다운캐스팅 되고 walk() 호출
//	   } else if (animal instanceof Mouse) {	//업캐스팅된 타입이 Mouse이면
//		   ((Mouse)animal).cry();				//animal이 다운캐스팅 되고 오버라이딩 된 cry() 호출
//		   ((Mouse)animal).sleep();				//animal이 다운캐스팅 되고 sleep() 호출
//	   } else {
//		   animal.cry();
//	   }					//이렇게 해도 되고 밑의 방법도 가능함
	   animal.cry();
	   
	   if(animal instanceof Cat) {
		   ((Cat)animal).play();
	   }else if(animal instanceof Dog) {
		   ((Dog)animal).walk();
	   }else if(animal instanceof Mouse) {
		   ((Mouse)animal).sleep();
	   }
   }
}
