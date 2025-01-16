package marvelTask;

public class MarvelHeroMain {
	public static void main(String[] args) {
		
		//아이언맨(ironMan)과 헐크(Hulk) 객체를 만들고 정보출력
		MarvelHero ironMan = new MarvelHero("아이언맨", "강력한 갑옷", 36);
		MarvelHero Hulk = new MarvelHero("헐크", "무력", 43);
		
		ironMan.printInfo();
		ironMan.performAction();
		Hulk.printInfo();
		Hulk.performAction();
	}
}
