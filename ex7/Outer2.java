package ex7;

public class Outer2 {
	static class Inner {
			int iv = 200;
	}
	
	
	public static void main(String[] args) {
		Outer2.Inner in = new Outer2.Inner();
		System.out.println("in.iv : " + in.iv);
	
		// 스태틱 클래스는 인스턴스 클래스와 달리 외부 클래스의 인스턴스를 생성하지 않고도 사용할 수 있다.
		// static 멤버를 인스턴스 생성없이 사용할 수 있는 것과 같다.
	}

}
