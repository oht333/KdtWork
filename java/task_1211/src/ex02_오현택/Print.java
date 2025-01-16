package ex02_오현택;

public class Print {
	public static void main(String[] args) {
//		2. 15부터 30까지 중 짝수의 합을 출력하라
//		1) num을 15로 대입, 합계인 sum은 0으로 초기화
//		2) while문을 이용해서 30까지 계속 num의 값을 sum에 더해주고 num을 1씩증가시킴
		int num = 15, sum=0;
		
		while(num<=30) {
			sum += num;
			num++;
		}
		
		System.out.println("합계 : " + sum);
		
	}
}
