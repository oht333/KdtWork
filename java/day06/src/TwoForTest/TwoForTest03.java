package TwoForTest;

import java.util.Scanner;

public class TwoForTest03 {
   public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);
	  
	  int num = 0;
	  
	  System.out.println("숫자를 입력하세요");
	  num=sc.nextInt();
	  sc.nextLine();
	   
      for (int i = 1; i <= num; i++) {
//         System.out.println("*"); //행
         for (int j = 1; j <= i; j++) { // 열
            System.out.print("*");
         }
         System.out.println();
      }

      
   }
}
