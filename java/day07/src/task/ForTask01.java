package task;

public class ForTask01 {

	public static void main(String[] args) {
		//1. 1 ~ 100까지 출력 tab키만큼 간격 띄우고 10마다 줄바꿈
		// 1	2	3	4	5	6	7	8	9	10
		//11	12	13	...						20
		//21	22	......						30
		//91	...								100
		
		//1) for문의 for문을 사용
		//2) 첫번째 for문은 행을 나타나기 때문에 1, 11, 21, 31, ...., 91 로 나오기
		//3) 두번째 for문에서 1, 2, 3, 4, 5
		
		for(int i=1;i<=10;i++) {
//			System.out.println((i-1)*10);
			for(int j=1;j<=10;j++) {
				System.out.print(j + (i-1)*10 + "\t");
			}
			System.out.println(); 
		}
		
		System.out.println();
		System.out.println("===================================");
		
		//2. A~F출력
		
		//1) int a = 'A' 의 결과값은 숫자로 나온다
		//2) for문을 써서 하나하나 +1을 시켜 char로 강제형변환 시키면 된다.
		for(int i = 0;i<6;i++) {
			System.out.print((char)('a'+i) + "\t");
		}
		
		System.out.println();
		System.out.println("===================================");
		
		//3. aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
		
		//1) 우선 소문자 형태로 알파벳 전부를 출력하자 (char)a 부터 시작해서 점점 1을 더하자
		//2) 여기서 if로 i가 짝수이면 대문자로 바뀌게끔 하자?
		int num = 0;
		char ch = 'a';
		for (int i = 0; i < 26; i++) { 
			char res = 'A';
			if(i%2==0) {
				res = (char)(ch + i); 
			}else {
				res = (char)(ch + i - 32); 
			}
			System.out.print(res);
        }
		
		System.out.println();
		System.out.println("===================================");
		
		//4. 1) 1부터 100까지 숫자 중 3의 배수 또는 5의 배수만 한 줄에 5개씩 띄어쓰기로 구분되도록 출력
		//	 2)	3의 배수 또는 5의 배수 숫자들의 합을 구하기
		
		//1) for i = 1~100
		//2) if (i%3==0 || i%5==0) { System.out.println:(i + " ")
		//3) count를 설정해서 if문을 적용해 5개 씩 한줄이 되도록 하기
		int count = 0;
		
		for(int i=1;i<=100;i++) {
			if (i%3==0 || i%5==0) {
				System.out.print(i + " ");
				count++;
				
				if(count % 5 == 0) {
					System.out.println();
				}
			}
		}
		
		
		
	}

}
