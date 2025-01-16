package print;
//9번 : 서식문자의 옵션(printf)
public class PrintTest03 {
	public static void main(String[] args) {
		System.out.println("===============================================");
		//기본 형식 지정자
		System.out.printf("%s %s", "hello", true);
		System.out.printf("\n%d %f", 2024, 11.123456);
		System.out.printf("\n%c", 'a');
		System.out.println("\n===============================================");
		//자리수를 지정하여 출력
		System.out.printf("%-5s %05d", "java", 1);	//-5를 하게 되면 왼쪽정렬을 하게되고, 5대신 05를 쓰면 5자리에서 1을 제외한 나머지는 0으로 채워진다
		System.out.printf("\n%-10s%d\\n", "안녕하세요", 500);	//-5를 하게 되면 왼쪽정렬을 하게되고, 5대신 05를 쓰면 5자리에서 1을 제외한 나머지는 0으로 채워진다
		System.out.printf("\n%-10.2s", "오현택");	// - : 왼쪽정렬, 10 : 10자리, .2 : 2개만 출력	
		System.out.println("\n===============================================");
		//정렬과 가격출력
		System.out.printf("\n%-5s\t\t%5d원", "꼬북칩", 2500);	
		System.out.printf("\n%-5s\t\t%5d원", "누네띠네", 3000);	
		System.out.printf("\n%-5s\t\t%5d원", "껌", 500);	
		
	}

}
