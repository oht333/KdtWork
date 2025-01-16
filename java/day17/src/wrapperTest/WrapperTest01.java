package wrapperTest;

public class WrapperTest01 {
	public static void main(String[] args) {
		//기본 자료형 -> Wrapper 클래스(박싱)
		int num1 = 10;
		System.out.println(num1);
		Integer iNum1 = Integer.valueOf(num1);
		System.out.println(iNum1 + 10);		//원래 객체에서 10을 더하면 오류가 나는게 당연한데 여기서는 자동언박싱되어서 값이 나온다
		
		//Wrapper 클래스 -> 기본자료형(언박싱)
		int unNum1 = iNum1.intValue();
		System.out.println(unNum1 + 10);
		
		//자동 박싱(AutoBoxing)
		double num2 = 1.1;
		Double dNum = num2;
		System.out.println(dNum);
		
		//자동 언박싱(AutoUnBoxing)
		double unNum2 = dNum;
		System.out.println(unNum2);
		
//		iNum1.
//		dNum.  이둘의 클래스가 다르므로 그에대한 메서드 기능도 다르게 나온다		
	}
}
