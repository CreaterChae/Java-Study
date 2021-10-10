package ex6;

public class Student {
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		// new Student 객체를 정의하는 생성자
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
		
	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAverage() {
		return (double)(getTotal()/3.0);
	} 
	
	
	
	public String info() { // 학생 정보를 출력하는 info 메서드를 정의함
					return name
					+ " , " + ban
					+ " , " + no
					+ " , " + kor
					+ " , " + eng
					+ " , " + math
					+ " , " + getTotal() // 총합
					+ " , " + getAverage(); // 평균
	}
	
		
	
	
	
		
	public static void main(String[] args) {
		
		Student s = new Student("홍길동",1,1,100,60,76);

		String str = s.info(); // 메서드 생성만 했지 정의 안 됨 클래스에서 info 메서드가 뭐 하는 메서드인지 정의 해줘야 함.
		System.out.println(str);
	
	
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	
	}

}
