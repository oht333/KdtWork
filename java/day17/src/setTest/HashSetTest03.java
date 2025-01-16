package setTest;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTest03 {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(20);
		li.add(20);
		li.add(30);
		li.add(30);
		System.out.println(li);
		System.out.println(li.size());
		
		HashSet<Integer> set = new HashSet<>(li);
		System.out.println(set);
		ArrayList<Integer> result = new ArrayList<>(set);
		System.out.println(result);		//중복을 제거할 때 순서가 별로 중요하지 않으면 set을 쓰고, 순서가 중요할때는 List 의 compare을 사용하면 좋다
	}
}
