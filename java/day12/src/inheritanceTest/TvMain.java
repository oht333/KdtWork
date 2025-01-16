package inheritanceTest;
//	7번 : 상속 기초
public class TvMain {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		System.out.println(tv1);
		tv1.powerOnOff();
		
		Tv2 tv2 = new Tv2();	//Tv2가 Tv1을 extends 하게되면 Tv1에 있는 메서드를 사용할 수 있다.
		System.out.println(tv2);
		tv2.netflix();
		tv2.chDown();
	}
}
