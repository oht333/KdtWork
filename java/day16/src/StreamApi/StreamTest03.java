package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest03 {
	public static void main(String[] args) {
		
		String[] names = {"Abc", "Def", "GhIj", "kLm"};
		
		//스트림을 사용하여 대문자로 변환
		String[] upperName = Arrays.stream(names).map(String::toUpperCase).toArray(String[]::new);
		System.out.println(upperName);
		
//		Arrays.stream(upperName).forEach(System.out::println);		//이 뒤에 소문자로 바꾸고 싶어서 toLowerCase로 바꿀려면 안된다. 한번만 사용 가능하기 때문에
		
		//스트림을 사용하여 리스트로 변환
		List<String> upper2 = Arrays.stream(names).map(String::toLowerCase).collect(Collectors.toList());
//													중간연산						최종연산
		System.out.println(upper2);
		
		//for문 사용
		for(int i=0; i<names.length; i++) {
			names[i] = names[i].toUpperCase();
		}
		System.out.println(Arrays.toString(names));
	}
}
