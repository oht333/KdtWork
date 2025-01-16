package twoArray;

import java.util.Arrays;

//7번 : Arrays.sort()를 이용한 정렬
public class ArraysTest {

	public static void main(String[] args) {
		int[] number = {5, 2, 9, 1, 6};
		
		System.out.println("정렬 전 : " + Arrays.toString(number));
		
//		Arrays.sort(number);	//전체정렬
		Arrays.sort(number, 1, 4);	//1인덱스 부터 3번째 인덱스 까지만 정렬을 해준다(5번째 인덱스 값은 6으로 똑같다 : 부분정렬)
		
		System.out.println("정렬 후 : " + Arrays.toString(number));
	}

}
