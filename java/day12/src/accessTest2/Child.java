package accessTest2;

import accessTest.Parent;

public class Child extends Parent{
	public void printAccess() {
		System.out.println(publicValue);
		System.out.println(protectedValue);
//		System.out.println(defaultValue);	//(다른 패키지에서)접근 불가
//		System.out.println(privateValue);	//(다른 패키지에서)접근 불가
	}
}
