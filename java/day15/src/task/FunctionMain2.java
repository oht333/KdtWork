package task;

public class FunctionMain2 {
	public static void main(String[] args) {
		
		FunctionalInter3 fi3 = new FunctionalInter3() {
			
			@Override
			public String combineString(String str1, String str2) {
				return str1 + str2;
			}
		};
		
		FunctionalInter3 fi4 = (str1, str2) -> {
			return str1 + str2;
		};
		
		System.out.println(fi3.combineString("안녕", "하세yo"));
		System.out.println(fi4.combineString("반갑", "습니da"));
	}
}
