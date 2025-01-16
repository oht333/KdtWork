package task;

public class Main {
	static MultipleInter calculator(boolean b) {
				
		if(b) {
			return (num1, num2) -> num1 * num2;
		} else {
			return (num1, num2) -> 0;
		}
	}
	
	public static void main(String[] args) {
		MultipleInter m1 = calculator(true);
		MultipleInter m2 = calculator(false);
		
		System.out.println(m1.multiply(3, 3));
		System.out.println(m2.multiply(3, 8));
	}
}
