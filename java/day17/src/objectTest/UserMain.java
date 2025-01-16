package objectTest;

public class UserMain {
	public static void main(String[] args) {
		User user1 = new User(1, "짱구");
		User user2 = new User(1, "짱구");
		
		System.out.println(user1);
		System.out.println(user2.toString());
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		
		System.out.println(user1 == user2);
		
		System.out.println(user1.equals(user2));
		
		//자기자신과 비교하는 경우 return true
		System.out.println(user1.equals(user1));
		//객체와 null을 비교하는 경우
		System.out.println(user1.equals(null));
		//유저번호가 일치하는지 비교하는 경우
		System.out.println(user1.equals(user2));
		System.out.println(user1 == (user2));	//관계연산자는 참조값으로 비교됨
		
		//이부분 중요 꼭 이해할것!
//      System.out.println(user1 instanceof User);
//      System.out.println(user2 instanceof User);
      Object obj = user1; 
//      obj.userNumber   //업캐스팅되었기 때문에 자식 클래스의 멤버 사용불가능
//      Object obj = user2;
      User user = (User)obj; //다운캐스팅
//      user.userNumber //userNumber 사용가능
		
	}
}
