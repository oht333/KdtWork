package threadTest;

public class JoinTest {
	public static void main(String[] args) {
		Runnable r1 = () -> {		/*Runnable은 함수형 인터페이스 이므로 람다식을 쓸 수 있다*/
			for(int i = 0; i<10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + "쓰레드 종료");
		};
		
		Thread t1 = new Thread(r1, "t1");
		Thread t2 = new Thread(r1, "t2");
		
		t1.start();
		t2.start();
		
		try {
//			t1.join();
			t1.join(1500);	/*딱 1.5초 기다렸다가 도중에 실행이 된다*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("main쓰레드 종료");
	}
}
