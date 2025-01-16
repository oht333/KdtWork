package review2;

public class Main {
	public static void main(String[] args) {
		Book book1 = new Book();
		System.out.println(book1.title);
		Book book2 = new Book("자바프로그래밍");
		System.out.println(book2.title);
		System.out.println(book2.author);
		Book book3 = new Book("java", "오라클");
		System.out.println(book3.title + "의 저자 " + book3.author);
		
		EBook ebook = new EBook();
		System.out.println(ebook.sizeInMB);
	}
}
