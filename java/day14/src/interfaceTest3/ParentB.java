package interfaceTest3;

public interface ParentB {
	default void greet() {
		System.out.println("ParentB의 greet메소드 호출");
	}
}
