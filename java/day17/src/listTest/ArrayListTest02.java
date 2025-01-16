package listTest;

class MyClass<T>{
	//필드
	T data;
	
	//생성자
	public MyClass(T data) {
		super();
		this.data = data;
	}
	
	//메소드
	void printData() {
		System.out.println(data);
	}	
}

public class ArrayListTest02 {
	public static void main(String[] args) {
//		MyClass mc1 = new MyClass(1);	//1은 Object타입으로 뭐든지 들어올 수 있다
		MyClass<Double> mc1 = new MyClass<>(1.1);	//제네릭을 통해 Double타입으로 제한 	
		System.out.println(mc1);
		mc1.printData();
		
		MyClass<String> mc2 = new MyClass<>("hello");	//제네릭을 통해 String타입으로 제한
		mc2.printData();
		
	}
}
