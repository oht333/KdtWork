package classBasic2;
//5번 : 클래스의 특징3(객체 생성의 틀)
public class Car {
	//필드
	String model;	//모델명
	String color;	//색상
	int speed;		//속도
	
	//메서드
	//속도를 증가시키는 메서드
	void accelerate(int value) {
		speed += value;
	}
	
	//주행을 멈추는 메서드
	void stop() {
		speed = 0;
	}
}
