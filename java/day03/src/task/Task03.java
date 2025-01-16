package task;

public class Task03 {
   public static void main(String[] args) {
      //int, long, double, float, boolean, char
      //1. 정수(int) -> 모든 자료형 강제형변환 가능여부 확인
	   int a = 3123;
	      long res = (long)a;
	      System.out.println(res);
	      double res2 = (double)a;
	      System.out.println(res2);
	      float res3 = (float)a;
	      System.out.println(res3);
//	      boolean res4 = (boolean)a;
//	      char res5 = (char)a;
//	      System.out.println(res5);
	      
      //2. 정수(long) -> 모든 자료형 강제형변환 가능여부 확인
      long b = 523141;
	      int res6 = (int)b;
	      double res7 = (double)b;
	      float res8 = (float)b;
//	      boolean res9 = (boolean)b;
	      char res9 = (char)b;
	      
      //3. 실수(double) -> 모든 자료형 강제형변환 가능여부 확인
      double c = 3.141592;
	      int res10 = (int)c;
	      double res11 = (double)c;
	      float res12 = (float)c;
//	      boolean res13 = (boolean)c;
	      char res14 = (char)c;
	      
      //4. 실수(float) -> 모든 자료형 강제형변환 가능여부 확인
      
      //5. 논리형 (boolean) -> 모든 자료형 강제형변환 가능여부 확인
      
      //6. 문자형(char) -> 모든 자료형 강제형변환 가능여부 확인
   }
}
