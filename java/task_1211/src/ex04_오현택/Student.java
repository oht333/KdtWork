package ex04_오현택;

public class Student {
//    - 필드 (private) : int javaScore, int dbmsScore, int htmlScore(과목 점수)
//    - 생성자 : Person의 생성자를 호출하고, 각 점수 초기화
//    - 메소드
//        getTotalScore() : 세 과목 점수를 더한 값(정수)을 반환
//        getAverageScore() : 평균(정수형)으로 반환
	
	//1) 요청사항 그대로 필드 및 생성자, 메소드 만들기(단축키를 쓰면 편안함)
	//2) 메소드는 return값에 바로 계산한 값을 넣으면 됨 (리턴타입 주의)
	private int javaScore;
	private int dbmsScore;
	private int htmlScore;
	
	public Student(int javaScore, int dbmsScore, int htmlScore) {
		super();
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
	}
	
	int getTotalScore() {
		return javaScore + dbmsScore + htmlScore;
	}
	
	int getAverageScore() {
		return (javaScore + dbmsScore + htmlScore)/3;
	}
}
