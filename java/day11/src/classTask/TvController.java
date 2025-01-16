package classTask;

import java.util.Scanner;

//3. BasicTv 클래스와 함께 동작하는 TvController 프로그램을 작성하세요
//프로그램은 사용자로부터 명령을 입력받아 TV를 제어한다
//
//BasicTv 객체를 생성하고, 초기값으로 색상 "Black", 크기 32인치, 가격 500000원을 설정
//프로그램은 무한 반복(while)하며 사용자에게 다음 메뉴를 출력한다
//
//=== TV 컨트롤 메뉴 ===
//1. 전원 On/Off
//2. 채널 올리기
//3. 채널 내리기
//4. 종료
//메뉴 번호 입력 : 
//
//사용자가 메뉴 번호를 입력하면, 입력된 번호에 따라 다음 동작을 수행한다
//1 : powerOnOff() 메서드 호출
//전원이 켜지면 "TV 전원이 켜졌습니다." 출력, 꺼지면 "TV 전원이 꺼졌습니다." 출력
//2 : TV 전원이 켜져 있으면 channelUp() 메서드 호출하고, "현재 채널: [채널 번호]"를 출력
//꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//3 : TV 전원이 켜져 있으면 channelDown() 메서드를 호출하고, "현재 채널: [채널 번호]"를 출력합니다. 꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//그 외 : 프로그램을 종료하고 "프로그램을 종료합니다." 메시지 출력


//1) Scanner import
//2) 필드 초기화
//3) while문으로 일단 true상태로 반복하게 구현
//4) 메뉴 번호 선택 하라는 문구 출력
//5) num = sc.nextInt();
//6) switch 문으로 case마다 메서드 호출 (break사용 및 종료할 경우 상태값을 true -> false로 변경)

public class TvController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String color = "Black";
		int inch = 32;
		int price = 500000;
		
		int num = 0;
		
		boolean isRunning = true;
		
		BasicTv btv = new BasicTv();
		
		while(isRunning) {
			System.out.println("=== TV 컨트롤 메뉴 +++");
			System.out.println("1. 전원 On/Off");
			System.out.println("2. 채널 올리기");
			System.out.println("3. 채널 내리기");
			System.out.println("4. 종료");
			System.out.print("메뉴 번호 입력 : ");
			num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
				case 1 :
					btv.powerOnOff();
					break;
				case 2 :
					btv.channelUp();
					break;
				case 3 :
					btv.channelDown();
					break;
				case 4 :
					System.out.println("프로그램을 종료합니다");
					isRunning = false;
					break;
				default :
					System.out.println("리모컨 버튼은 1~4 입니다. 다시 입력하세요.");		
					break;
			}
//			if(num==1) {
//				btv.powerOnOff();
//			}else if(num==2) {
//				btv.channelUp();
//			}else if(num==3) {
//				btv.channelDown();
//			}else if(num==4) {
//				System.out.println("프로그램을 종료합니다");
//				break;
//			}else {
//				System.out.println("리모컨 버튼은 1~4 입니다. 다시 입력하세요.");
//			}
		}
		
	}
}
