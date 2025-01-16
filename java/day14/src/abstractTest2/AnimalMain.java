package abstractTest2;
//5번 : 추상클래스와 강제성				추상클래스 : 필드, 생성자, 일반메소드 그리고 추상메소드 로 구성되어 있다
public class AnimalMain {
	public static void main(String[] args) {
		Animal animal = new Cat();
		Animal animal2 = new Dog();
		System.out.println(animal);
		System.out.println(animal2);
		
		animal.crying();
		animal2.crying();
	}
}
