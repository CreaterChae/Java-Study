package ex4;

public class Sum2 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i =0; i <str.length(); i++) {
			// sum += str.charAt(i); 을 하게되면 '1' '2' '3' '4' '5'에 대응되는
			// 아스키 코드의 숫자를 더하게 된다.
		
				sum += str.charAt(i) - '0'; // -0의 역할 : 문자를 숫자로 변환
				// 뺄셈과 같은 이항연산자는 int보다 작은 타입의 피연산자(byte, short, char)를 int로 변환
		}
		System.out.println("sum=" + sum);
		
		
		
		// math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장해라
		int value = (int)(Math.random()*6) +1;
		
		System.out.println("value:" + value);
		
		// int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		
		int num = 12345;
		int sum2 = 0;
		
		while(num > 0) {
			
			sum2 += num%10;
			num /= 10;
			
			// 12345는 12340 + 5 따라서 10으로 나눈 나머지값이 일의 자리다.
			// 나머지 자리수도 10의 나머지 값으로 구할 수 있다.
		}
			System.out.println("sum2=" +sum2);
		
	}
		
}

	