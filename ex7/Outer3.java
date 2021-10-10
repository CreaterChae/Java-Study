package ex7;

public class Outer3 {
	
	int value = 10;
	
	class Inner {
		
		int value = 20;
		
		void method1() {
			int value = 30;
			
				System.out.println(value); // 지역변수 value
				System.out.println(this.value); // Inner 클래스의 iv인 value
				System.out.println(Outer3.this.value); // Outer3 클래스의 iv인 value
		}
		
	}

	

	public static void main(String[] args) {
		
		// 외부 클래스의 인스턴스를 생성한 다음에야 내부 클래스의 인스턴스를 생성할 수 있다.
		Outer3 out = new Outer3();
		Outer3.Inner in = out.new Inner();
		
		in.method1();

	}

}
