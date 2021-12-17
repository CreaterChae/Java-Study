package ch03;

public class Student {

	String Name;
	int Money;
	
	public Student(String Name, int Money) {
		this.Name = Name;
		this.Money = Money;
	}
	
	public void takeBus(Bus bus) { // 버스를 타는 메서드
		bus.take(1000);
		this.Money -= 1000;
	}
	
	public void takeSubway(Subway subway) { // 지하철을 타는 메서드
		subway.take(1200);
		this.Money -= 1200;
	}
	
	public void takeTaxi(Taxi taxi) { // 택시를 타는 메서드
		taxi.take(10000);
		this.Money -= 10000;
	}
	
	
	public void showInfo() { // 정보를 보여주는 메서드
		 System.out.println(Name + "님의 남은 돈은 " + Money + "원 입니다.");
		 
	}
}
