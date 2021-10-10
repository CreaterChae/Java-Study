package ex7;

public class SutdaDeck {
	
	
		// 섯다카드 20장을 담는 sutdacard 배열을 초기화 하시오
		final int CARD_NUM = 20;
		SutdaCard[] cards = new SutdaCard[CARD_NUM]; // 빈배열만 생성 객체 넣어줘야 함.
		
		SutdaDeck() { // 객체 넣기
			
			for(int i=0; i<cards.length; i++) { // 20개의 배열에 1~10을 두번 넣어야 함.
				int num = i%10+1;
				boolean isKwang = (i < 10) && (num == 3 || num == 8 || num == 10); // i가 10이하인 것중 3,8,10만 광이 됨
			
				cards[i] = new SutdaCard(num, isKwang); // num과 iskwang이 지역변수라  for문 안에 있어야 함.
			}	
		}
	
		// 섞기
		void shuffle1() { // iv를 사용하니 static 메서드가 아닌 그냥 메서드
			for(int i = 0; i < cards.length; i++) {
				int j = (int)(Math.random()*cards.length);
			
				SutdaCard tmp = cards[i]; // int tmp는 안 됨. 왜? cards는 참조형 변수라 기본형에 담을 수 없음.
				cards[i] = cards[j];
				cards[j] = tmp;
			
			}
		}

		// 뽑기
		SutdaCard pick1(int index) {
			if(index < 0 || index > 20 ) {
			return null;	
		}
			return cards[index];
		}
		
		SutdaCard pick1() {
			int index = (int)(Math.random()*cards.length);
			return pick1(index); // 위의 메서드를 호출해 그대로 사용
	}
		
		class SutdaCard {
			int num;
			boolean isKwang;
			
			SutdaCard() { // 무슨 역할인지 물어보기
				this(1, true);
			}
		
			SutdaCard(int num, boolean isKwang) {
				this.num = num;
				this.isKwang = isKwang;
				
			}
		
			public String toString() {
				return num + (isKwang ? "K" : "");
			}
		}	

		public static void main(String[] args) {		// 기본 클래스는 항상 public class 안에 있어야 한다.
			SutdaDeck deck = new SutdaDeck();
		
			for(int i = 0; i < deck.cards.length; i++)
				System.out.println(deck.cards[i] + ",");
		
			
			
			System.out.println(deck.pick1(0)); // 0번째 카드 뽑음
			
			System.out.println(deck.pick1()); // 아무 카드나 뽑음
			
			deck.shuffle1(); // 섞기
			
			// 섞은 것들을 나열
			for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
			System.out.println();
			
			System.out.println(deck.pick1(0)); // 0번째 카드 뽑음
		}

	}

	

	

