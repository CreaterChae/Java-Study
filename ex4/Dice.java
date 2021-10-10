package ex4;

public class Dice {

	public static void main(String[] args) {
		
		// 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수
		
		/*
		 * 6이 되는 경우의 수
		 * 
		 * 1 + 5
		 * 2 + 4
		 * 3 + 3
		 * 4 + 2
		 * 5 + 1
		 * 
		 * 중첩 for문 사용
		 * 
		 */
	
			for(int i = 1; i <= 6; i++) {
				for(int j =1; j <= 6; j++)
					if(i+j == 6) 
						System.out.println(i + "+" + j + "=" + (i+j));
			}
				
	}

}
