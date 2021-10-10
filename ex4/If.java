package ex4;

public class If {

	public static void main(String[] args) {


		
		// 1~20 사이 수 중 2의 배수와 3의 배수가 아닌 수만 골라 더하라
		int sum = 0;
		
		for(int i=1; i<=20; i++)
			if((i%2!=0 && i%3!=0)) { // 2와 3의 배수 둘 다 아니어야 하기 때문에 && 쓴다.
				sum += i; 
			}
			System.out.println(sum);	
		
			
		// 1 + (1+2) + (1+2+3) + (1+2+3+4) +...+(1+2+3+4+..+10)의 결과
		int sum1 = 0;
		int totalsum = 0;
	
		for(int i =1; i<=10; i++) {
			sum1 += i;
			totalsum += sum1;
		}
	
		System.out.println(totalsum);
	
		int num = 0;
		int sum2 = 0;
		int s = 1;
		
		// 1+(-2)+3+(-4)+... 했을 때 몇까지 더해야 총합이 100이상 되는지
		for(int i = 1; sum2 < 100; i++, s =-s) { // 증감식도 , 를 이용해서 두 문장 이상을 하나로 연결해서 쓸 수 있다.
			num = i * s;
			sum2 += num;
	}
			System.out.println(num);
			System.out.println(sum2);
	
	
	}
}