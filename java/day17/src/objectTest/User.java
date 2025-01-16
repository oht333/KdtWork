package objectTest;

//1번 : Object 클래스
public class User {
   // 필드
   int userNumber;
   String userName;

   // 기본 생성자
   public User() {
      super();
   }

   // 생성자 오버로딩
   public User(int userNumber, String userName) {
      super();
      this.userNumber = userNumber;
      this.userName = userName;
   }

   // toString 오버라이딩
   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return "User [userNumber = " + userNumber + ", userName = " + userName + "]";
   }

   // hashCode 오버라이딩
   @Override
   public int hashCode() {
      // TODO Auto-generated method stub
      return this.userNumber;
   }

   // equals 오버라이딩
   @Override
   public boolean equals(Object obj) {
      // 자기자신과 비교하는 경우
      if (this == obj) {
         return true;
      }

      // 유저번호가 일치하는지 비교하는 경우
      if (obj instanceof User) {
         User user = (User) obj;
         if (user.userNumber == this.userNumber) {
            return true;
         }
      }

      return false;

   }

}
