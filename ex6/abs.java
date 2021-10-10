package ex6;

public class abs {

	// 주어진 값의 절대값을 반환하는 메서드 만들기
	public static int abs(int value) {
		if(value < 0) {
			return Math.abs(value);
		}
			return value;
	}
	
	
	
	public static void main(String[] args) {
		
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
		
	}

}
