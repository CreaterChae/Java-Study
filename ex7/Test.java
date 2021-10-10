package ex7;

public class Test {

	abstract class Player {
		abstract void play(int pos);
		abstract void stop();
		
	}
	
	class AudioPlayer extends Player {
		void play(int pos) {}
		void stop() {}
	}
	
	public static void main(String[] args) {
		Player p = new Player(); // 상속받아 추상메서드를 완성해줬더라도 조상의 인스턴스는 생성불가
		AudioPlayer ap = new AudioPlayer();
		
		
	}

}
