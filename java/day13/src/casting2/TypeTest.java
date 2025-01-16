package casting2;
//6번 : 자식객체의 타입 여러개인지 확인-메인클래스
public class TypeTest {
	public static void main(String[] args) {
		Parents p = new Parents();
		Child c = new Child();
		
		System.out.println(p);
		System.out.println(c);
		
		//객체 instanceof 클래스명 => boolean타입으로 나온다
		//instanceof : 객체가 특정 클래스나 해당 클래스의 자식 클래스인지 확인할 때 사용
		System.out.println(p instanceof Parents);	//p는 Parents 타입이 맞으니까 true로 나옴
		System.out.println(p instanceof Child);		//p는 Child 타입이 아니니까 false로 나옴
		System.out.println(c instanceof Child);		//true
		System.out.println(c instanceof Parents);	//c는 Parents 타입도 갖고 있으니까 true
		//자식 클래스 타입의 객체는 부모 클래스 타입도 동시에 갖는다!!!
		
		Parents pp = new Child();	//
		Child cc = new Child();		//자식껄 가지고 있으면서 부모것도 가지고 있다(상속)
	}
}
