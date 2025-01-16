package review2;

public class Book {
	// 필드
	String title;
	String author;
//	author = "ㅇㅇㅇ"; 필드는 변수처럼 초기화를 따로 할 수 없다 (Error)
	
	//생성자
	public Book() {
		this("알수없음", "알수없음");
	}
	
	public Book(String title) {
		this(title, "알수없음");
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	
	
}
