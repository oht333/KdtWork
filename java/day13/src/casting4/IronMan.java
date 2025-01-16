package casting4;

public class IronMan extends Hero {

	public IronMan(String name) {
		super(name);
	}

	@Override
	void superPower() {
//		System.out.println(this.name + "이/가 수트를 입고 날아갑니다");
		System.out.println(this.getName() + "이/가 수트를 입고 날아갑니다");
	}
	
	

	
}
