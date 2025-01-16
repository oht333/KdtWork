package constructorBasic2;
// 7번 : 기본생성자 확인
class Student{
	//필드
	String name;
	int age;
	
	//기본생성자
	public Student() {
		System.out.println("기본생성자가 호출되었습니다");
	}
	
	public Student(String name) {
		this.name = name;		//this.name == st1.name
		System.out.println(this.name);
	}
	
    // 생성자
    public Student(String name, int age) {
       name = name; // 의도한대로 동작하지 않는다
       age = age; // 지역변수의 값을 그대로 대입하기 때문에 필드는 초기화 되지 않는다
       System.out.println(name);
    }

    // 메소드
    void studentInfo() {
       System.out.println("이름 : " + name);
       System.out.println("나이 : " + age);
    }
}

public class StudentMain {
	public static void main(String[] args) {
		Student st1 = new Student("짱구", 5);		//생성자가 먼저 실행된다 (출력문 출력됨) : 객체 생성시 기본생성자 출력
	      st1.studentInfo();
//	      System.out.println(name);

	}
}
