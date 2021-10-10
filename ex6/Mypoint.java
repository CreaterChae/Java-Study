package ex6;

public class Mypoint {
	 
	int x;
	int y;
	 
	 Mypoint(int x, int y) {
		 this.x = x;
		 this.y = y;
}
	 // 인스턴스 변수를 사용했으니 static 붙이면 안 됨!
	 double getDistance(int x1, int y1) { // static일때는 매개변수를 4개 받았다. x,x1,y,y1 그러나 인스턴스를 생성하면 x,y가 정의됨
			return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); // 따라서 x1,y1 2개의 매개변수만 받으면 된다.
		}
	 
	 
public static void main(String[] args) {

	
	
	Mypoint p = new Mypoint(1,1);		
	
	// p와 (2,2) 사이의 거리를 구한다.
	System.out.println(p.getDistance(2,2));
}


}