package inheritanceConstructor2;

public class SuperCar extends Car {
	//필드
	boolean booster;
	
	//메소드
	void boosterOn() {
		System.out.println("부스터 가동");
	}
	
	void boosterOff() {
		System.out.println("부스터 중지");
	}
	
	//생성자
	public SuperCar() {
		super();
	}

	public SuperCar(String brand, String color, int price, boolean booster) {
		super(brand, color, price);	//부모에서 자동으로 매개변수 값이 들어온 것을 그대로 쓴다
		this.booster = booster;
	}	
	
}
