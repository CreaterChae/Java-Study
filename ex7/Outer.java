package ex7;

public class Outer {
	class Inner {
		int iv = 100;

		public void method() {
			
			System.out.println(iv);
			
		}
	}

	
	public static void main(String[] args) {
			Outer out = new Outer(); // 내부 클래스의 인스턴스를 생성하기 위해서는 먼저 외부클래스의 인스턴스를 생성해야 한다.
			Outer.Inner in = out.new Inner();
			in.method();
	
			
	}

}
