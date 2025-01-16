package throwsTest;
//5번 : 예외 던지기(throws는 메소드 선언부에 사용한다)
public class ThrowsTest {
	
	static void method() {
		System.out.println("카운트다운 후 핵폭탄을 발사하세요.");
		for(int i=0; i<10; i++) {
			System.out.println(10-i);
			System.out.println("발사!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	//500 => 0.5초, 1000 => 1초
		}
	}
	
	public static void main(String[] args) {
		method();
	}

}
