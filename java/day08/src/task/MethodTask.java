package task;

public class MethodTask {

		//1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
		// 매개변수o, 리턴값o
		// 메소드명 : changeSign
		int changeSign(int num) {
			int res = -num;
			return res;
		};
		
		//2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
		// 매개변수 o, 리턴값o
		// 메소드명 : printName
		String printName(int num, String name) {
			for(int i=0; i<num; i++) {
				System.out.println(name);
			}
			return "정수 : " + num + ", 이름 : " + name;
		}
		
		//3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
		// 매개변수o, 리턴값o
		// 메소드명 : cahangeNumber
		
		int changeNumber(int num) {
			if(num<=10) {
				return 1;
			} else {
				return 100;
			}
		}
		
		
		//4. 5개의 정수중 평균을 반환하는 메소드
		// 매개변수o(배열이용), 리턴값o
		// 메소드명 : getAvg
		double getAvg(int[] arr) {
			int sum = 0;
			double avg = 0;
			
			for(int i=0; i<arr.length; i++) {
				sum += arr[i];
			}
			
			avg = (double)sum/arr.length;
			
			return avg;
		}
		
		//5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
		// 매개변수o(배열), 리턴값x
		// 메소드명 : printMinMax
		
		void printMinMax(int[] arr) {
			int min = arr[0]; // 최소값 초기화
		    int max = arr[0]; // 최대값 초기화
		    
		    for (int num : arr) {
		        if (num < min) {
		            min = num; 
		        }
		        if (num > max) {
		            max = num; 
		        }
		    }
		    
		    System.out.println("최소값 : " + min);
		    System.out.println("최대값 : " + max);
		}
		
		//6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
		//BaNanA -> bAnANa
		// 메소드명 : changeCase
		//매개변수와 리턴값 자유 => 단, 형변환 이용할 것
		void changeCase(String word) {
			
		}
		
		//7. 아이디와 비밀번호를 입력받아 로그인하기
		// 매개변수 o, 리턴값 o(boolean 타입)
		// 메소드명 : login
		//main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
		// 둘 중 하나라도 틀리면 잘못입력했습니다 출력
		boolean login(String id, int pwd) {
			if(id.equals("admin") && pwd==1234) {
				System.out.println("관리자님 환영합니다");
				return true;
			}else {
				System.out.println("잘못입력했습니다");
				return false;
			}
		}
		
}
