package ex11;

import java.util.*;

public class Person {
		String name;
		int age;
	
		public String toString() { return name + ":" + age;}
	
		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof Person)) return false;
			
			Person p = (Person)obj;
			// 나자신(this)의 이름과 나이를 p와 비교
			return this.name.equals(p.name) && this.age == p.age;
		}
			
			
		@Override
		public int hashCode() {
			return Objects.hash(name, age); // 매개변수 넣어주기
		}
	
		Person(String name, int age) {
			
			this.name = name;
			this.age = age;
	}
		
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
	
		
		System.out.println(set);
	
		// hashset이 올바르게 중복제거를 하려면 hashcode와 equals가 오버라이딩 되어있어야 함
		
		
	}

}
