package interfaceTest3;

public interface ParentA {
	default void greet() {		//default 메소드 사용가능
		System.out.println("ParentA의 greet 메소드 호출");
	}
}
