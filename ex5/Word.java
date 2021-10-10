package ex5;

import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		// 단어의 글자위치를 섞어서 보여주고 원래 단어를 맞추는 프로그램을 만들어라
	
		String[] words = { "television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
	
		for (int i =0; i < words.length; i++) { // string을 char로 변환시켜주기 위한 반복
			char[] question = words[i].toCharArray();
			
			for (int n = 0; n < question.length; n++) { // char[]을 섞어주기 위한 반복
		        int j = (int)(Math.random() * question.length);
		        char temp = question[n];
		        question[n] = question[j];
		        question[j] = temp;
			}
		
		        System.out.printf("Q%d. %s의 정답을 입력하세요 > ", i+1, new String(question));
		        
		        String answer = scanner.nextLine();
		        
		        if (words[i].equals(answer.trim()))
		        		System.out.printf("맞았습니다.%n%n");
		        else
		        	System.out.printf("틀렸습니다.%n%n");
		
		
		}
	
	}


}