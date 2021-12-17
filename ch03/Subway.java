package ch03;

public class Subway {

		int lineNumber;
		int passengerCount;
		int money;
		
		public Subway(int lineNumber) { // 승객수와 돈의 초기값은 어차피 0이기 때문에 따로 초기화 하지 않음 
			this.lineNumber = lineNumber;
		}
		
		public void take(int money) { // 승객을 태우는 메서드
			this.money += money; // 승객이 낸 돈 만큼 money(기차의 iv)에 축적
			passengerCount++;	
		}
		
		public void showBusInfo() {
			System.out.println(lineNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
		}
		
	}

