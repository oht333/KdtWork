package ex03_오현택;

public class Stars1 {
	public static void main(String[] args) {
		//0) Scanner import
			//1) 2중 for문 사용
			//2) 행이 3개이니 첫번째 for문에서 조건식을 i<3으로 지정
			//3) 우선 공백이 먼저 들어가야하니 공백은 3,2,1로 천천히 줄어드므로 3-i를 조건식으로 지정
			//4) 그다음으로 "*"가 들어가야 하는데 1,2,3으로 천천히 증가하므로 i+1을 조건식으로 지정
			//5) 마지막으로 행을 끊어주는 System.out.println(); 사용
		for(int i=0; i<3; i++) {
			for(int j=0; j<3-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i+1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
