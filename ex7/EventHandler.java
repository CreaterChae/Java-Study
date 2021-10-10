package ex7;

import java.awt.Frame;
import java.awt.event.*;

public class EventHandler {

	public static void main(String[] args) {
	
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		
		}
	); // 익명 클래스의 끝

	} // main의 끝

}	
class EvenHandler extends WindowAdapter {
	

	public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			e.getWindow().dispose();
			System.exit(0);
		
	}
}

// 익명 클래스 = 이름이 없는 클래스. 조상의 이름이나 구현 인터페이스의 이름을 빌려씀
// 단 하나의 클래스를 상속받거나 단 하나의 인터페이스만 구현할 수 있다.