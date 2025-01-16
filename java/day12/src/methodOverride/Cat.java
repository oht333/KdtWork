package methodOverride;

public class Cat extends Animal {
	
	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	//메소드 오버라이딩 : alt + shift + s + v
	@Override
	void sound() {
		System.out.println(this.name + "이/가 야옹하고 웁니다");
	}
	
}
