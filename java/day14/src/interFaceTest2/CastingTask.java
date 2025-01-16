package interFaceTest2;

public class CastingTask {
	public static void main(String[] args) {
		check(new Ballad());
		check(new HipHop());
		check(new Rock());
	}
	
	static void check(Music music) {
		music.mode();
		if (music instanceof Ballad) {
			((Ballad) music).onlyBallad();
		} else if (music instanceof HipHop) {
			((HipHop) music).onlyHipHop();
		} else if (music instanceof Rock) {
			((Rock) music).onlyRock();
		}
	}
}
