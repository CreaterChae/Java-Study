package ex11;

import java.util.*;

public class Student implements Comparable {
	
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	double getAverage() {
		return getTotal()/3.0;
	}
	

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + ","
				+ getTotal() + "," + getAverage();
	
	
	
	}
	
	public int compareTo(Object o) { // object를 매개로 하는 메서드 구현
		if(o instanceof Student) { //student 객체끼리 비교하는 거니 object가 student로 형변환 가능한지 확인
			Student tmp = (Student)o;
			return name.compareTo(tmp.name);
		}
		else return -1;
	}



	
	public static void main(String[] args) {
		// 이름이 기본 정렬 기준이 되도록 해라
		
		ArrayList list = new ArrayList();
		
		list.add(new Student("홍길동",1,1,100,100,100));
		list.add(new Student("남궁성",1,2,90,70,80));
		list.add(new Student("김자바",1,3,80,80,90));
		list.add(new Student("이자바",1,4,70,90,70));
		list.add(new Student("안자바",1,5,60,100,80));
		

		
		
	Collections.sort(list);
	Iterator it = list.iterator();
	

	while(it.hasNext())
		System.out.println(it.next());
}


}
