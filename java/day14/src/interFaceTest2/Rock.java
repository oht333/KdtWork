package interFaceTest2;
//8번 : review 예제
public class Rock implements Music {

	@Override
	public void mode() {
		System.out.println("락 모드");
	}
	
	void onlyRock() {
		System.out.println("onlyRock 실행");
	}
	
}
