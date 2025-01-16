package TwoForTest;

public class TwoForTask01 {
   public static void main(String[] args) {
//      i, j의 규칙성 찾기
      
//      1번 : 역삼각형
//      *****
//      ****
//      ***
//      **
//      *
	   
	   for(int i=1;i<=5;i++) {
			for(int j=1;j<=(5-i);j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	   
	   System.out.println("============================");
      
//      2번 : 피라미드와 유사하지만 좌측 정렬
//      *
//      * * *
//      * * * * *
//      * * * * * * *
	   for(int i=0;i<=3;i++) {
		   System.out.println("");
		   for(int j=1;j<=(2*i)+1;j++) {
			   System.out.print("* ");
		   }
	   }
	   
//	   System.out.println("\n");
//	   
//	      for(int i = 1; i <= 4; i++) {
////	         System.out.println(i);
//	         for(int j = 1; j <= 2 * i - 1; j++) {
////	            System.out.println("i : " + i + ", j : " + j);
//	            System.out.print("*");
//	         }
//	         System.out.println();
//	      }

	   
	   System.out.println();
	   System.out.println();
	   System.out.println("============================");
	   System.out.println();
	   
      
//      3번 : 피라미드 (for문이 총 3개-> 어떻게 사용될지 먼저 생각하기)
//       *
//      * *
//     * * *


       for (int i = 1; i <= 3; i++) { // 줄 반복
           // 공백 출력
           for (int j = 1; j <= 3 - i; j++) {
               System.out.print(" ");
           }
           // 별 출력
           for (int k = 1; k <= i; k++) {
               System.out.print("* ");
           }
           System.out.println(); // 줄 바꿈
       }
      
   }
}
