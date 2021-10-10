package ex6;

public class Distance {

	int x, y, x1, y1;
	
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}
	// 제곱근을 구하는 함수 : math.sqrt static
	//스태틱 메서드이기 때문에 인스턴스를 생성할 필요 없다.
	// 변수만 생성해주면 됨
	


	public static void main(String[] args) { // 메인 메서드는 public class안에 있어야 함
		System.out.println(getDistance(1,1,2,2));

		
	}

 }


