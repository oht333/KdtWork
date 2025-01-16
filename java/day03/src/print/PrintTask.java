package print;
//10번 : 실습
public class PrintTask {
	public static void main(String[] args) {
		
		//1. printf를 사용해 형식에 맞게 출력하기
		//이름 : 본인이름
		//나이 : 본인나이
		//취미 : 취미
		//키 : 실수형 2자리까지
		//몸무게 : 실수형 3자리까지
		
		String name = "오현택";
		int age = 32;
		String hobby = "영화감상";
		double height = 173.87;
		double weight = 75.321;
		
		System.out.printf("이름 : %s", name);
		System.out.printf("\n나이 : %d", age);
		System.out.printf("\n취미 : %s", hobby);
		System.out.printf("\n키 : %.2f", height);
		System.out.printf("\n몸무게 : %.3f", weight);
		
		System.out.println("\n\n====================================\n");
		//2. 10진수의 값 255를 8진수, 16진수로 각각 출력하기
		
		int num = 255;
		System.out.printf("10진수 : %d", num);		
		System.out.printf("\n8진수 : %o", num);		
		System.out.printf("\n16진수 : %x", num);		
		
		System.out.println("\n\n====================================\n");
		//3. 상품정보를 println과 printf를 사용하여 아래 형식으로 출력하기
		// 각 자리수는 5자리로 정렬, tab키 2번 사용
//      -------------------------
//      상품명         가격
//      -------------------------
//      메로나         1500원
//      누네띠네       1200원
//      꼬북칩         2000원
//      초코파이       3000원
//      -------------------------
		
      System.out.println("\n-------------------------");
      System.out.printf("%-5s\t\t%5s\n", "상품명", "가격");
      System.out.println("-------------------------");
      System.out.printf("%-5s\t\t%5d원\n", "메로나", 1500);
      System.out.printf("%-5s\t\t%5d원\n", "누네띠네", 1200);
      System.out.printf("%-5s\t\t%5d원\n", "꼬북칩", 2000);
      System.out.printf("%-5s\t\t%5d원\n", "초코파이", 3000);
      
      //4. 봄여름가을겨울을 아래와 같이 출력하기
      //출력문 1번으로 아래와 같이 출력하기
      System.out.printf("봄\n\t\t여름\n\t가을\n\t\t겨울");
	}
}
