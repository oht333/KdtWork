package teamTask;

public class TeamTask01 {
//  1. Scanner 클래스 import
//  2. 키랑 나이 변수 선언 및 초기화
//  3. 키랑 나이 입력받기
//  4. if (키 <= 120 && 나이 <= 8) {
//     "탑승이 불가합니다" 출력
//  }
//  5. } else if (키 >= 160 && 나이 >= 15) {
//     "탑승이 불가합니다" 출력
//  } else {
//  6.    "탑승 해주세요" 출력 }
//  7. 버퍼 비우기 sc.close(); 또는 sc.nextLine(); - 미작성시 서운합니다..
	public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int height = 0;
//      int age = 0;
//      
//      System.out.println("키랑 나이를 입력해주세요");
//      height = sc.nextInt();
//      age = sc.nextInt();
//      
//      if(height <= 120 && age <= 8) {
//         System.out.println("탑승이 불가합니다");
//      } else if (height >= 160 && age >= 15) {
//         System.out.println("탑승이 불가합니다");
//      } else {
//         System.out.println("탑승해주세요");
//      }
//      
//      sc.close();
      
//      for(int i=0; i<3; i++) {
//         for(int j=1; 0<=(6-2*j); j++) {
//            System.out.print(" ");
//         }
//         for(int k=0; (2*k-1)<0; k++) {
//            System.out.print("* ");
//         }
//         System.out.println();
//      }
      
        int n = 3; // 트리의 높이
        
        for (int i = 0; i < n; i++) {
            // 1. 공백 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // 2. 별 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            // 3. 줄 바꿈
            System.out.println();
        }

		
	}
}
