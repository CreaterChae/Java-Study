package ex4;

public class Number {

	public static void main(String[] args) {
		// 숫자 맞추기 게임/ 1과 100 사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞히면 게임이 끝난다.
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		// 화면에서 사용자입력을 직접 받기 위해서 Scanner 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt();
		
			if(input < answer)
				System.out.println("더 큰 수를 입력하세요");
			
			else if(input > answer) 
				System.out.println("더 작은 수를 입력하세요"); 			
			else
				{
				System.out.println("맞혔습니다.");
				System.out.println("시도횟수는" + count + "번 입니다");
			break; 
			}
		
		}	while(true);
		
	}
}
