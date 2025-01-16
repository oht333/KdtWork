package task1;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		
		
		
		HashMap<String, Employee> info = new HashMap<>();
		
		info.put("id1", new Employee("id1" ,"오현택", 34, "보안부서"));
		info.put("id2", new Employee("id2" ,"최윤철", 34, "보안부서"));
		info.put("id3", new Employee("id3" ,"박형준", 33, "개발부서"));
		
		Set<Entry<String, Employee>> items = info.entrySet();
		for (Entry<String, Employee> entry : items) {
			System.out.println(entry);
	    }	
	}
}
