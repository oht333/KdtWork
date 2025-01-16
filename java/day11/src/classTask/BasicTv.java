package classTask;

//2. BasicTv 클래스를 작성하세요
//필드 :
//boolean power : TV 전원 상태 (기본값: false)
//int channel : TV 채널 (기본값: 1)
//String color : TV의 색상
//int size : TV의 크기
//int price : TV의 가격
//
//메서드:
//void powerOnOff() : TV 전원을 켜거나 끄는 메서드
//      전원이 켜져 있으면 끄고, 꺼져 있으면 켜야 다른 동작이 가능하다
//void channelUp() : 채널을 1씩 증가시키는 메서드
//      채널 최대값 999
//void channelDown() : 채널을 1씩 감소시키는 메서드
//      채널 최소값 1

// 1) 필드 작성
// 2) powerOnOff() 매서드 작성
//	2-1) power = !power; 사용을 하면 간단하게 상태를 변화
//  2-2) if문 사용해서 상태에 따라 다르게 출력
// 3) channelUp()
//	3-1) if문으로 파워가 켜졌을때 메서드 작동되게 하고 아니면 종료
//	3-2) if문으로 1미만, 999초, 1~999 의 경우를 나눠서 구현
// 4) channelDown() 또한 channelUp과 동일한 방식으로 구현

public class BasicTv {
	boolean power;
	int channel = 1;
	String color;
	int size;
	int price;
	
	void powerOnOff() {
		power = !power;
		if(power == true) {
			System.out.println("전원이 켜졌습니다.");
		} else {
			System.out.println("전원이 꺼졌습니다.");			
		}
	}
	
	void channelUp() {
		if(power==true) {
			channel++;
			if(channel<=0) {
				channel = 999;
				System.out.println(channel + "번 채널입니다.");				
			} else if (channel>999) {
				channel = 1;
				System.out.println(channel + "번 채널입니다.");				
			} else {
				System.out.println(channel + "번 채널입니다.");
			}
		} else {
			System.out.println("전원을 켜주십시오.");
		} 	
	}
	
	void channelDown() {
		if(power==true) {
			channel--;
			if(channel<=0) {
				channel = 999;
				System.out.println(channel + "번 채널입니다.");				
			} else if (channel>999) {
				channel = 1;
				System.out.println(channel + "번 채널입니다.");				
			} else {
				System.out.println(channel + "번 채널입니다.");
			}
		} else {
			System.out.println("전원을 켜주십시오.");
		} 	
	}
}
