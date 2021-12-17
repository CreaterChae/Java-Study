package ch03;

public class Test {

	public static void main(String[] args) {
	
		Student student1 = new Student("James", 5000);
		Student student2 = new Student("Tomas", 10000);
		Student student3 = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		student1.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		student2.takeSubway(greenSubway);
		
		Taxi unsuTaxi = new Taxi("잘 간다 운수 택시");
		student3.takeTaxi(unsuTaxi);
		
		
		
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		greenSubway.showBusInfo();
		unsuTaxi.showTaxiInfo();
		
		
	}

}
