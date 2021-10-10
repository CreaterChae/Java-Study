package ex6;

public class Max {
	
	// 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
	public static int max(int[] arr) { // 리턴값이 그냥 수라서 int[] max가 아닌 int max
		if(arr == null || arr.length == 0)
			return -999999;
		
		int max = arr[0]; // 맥스를 초기화한 값을 for문 밖으로 빼주지 않으면 return max에서 max에 대한 값을 지정하지 않아 오류생김
		for(int i = 1; i < arr.length; i++) {
				if( max < arr[i]); {
					max = arr[i];
				}
			
		}
		return max;
	
	}
	

	public static void main(String[] args) {
		
		
		int [] data = { 3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data)); // 배열을 문자열로 간편하게 출력
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null)); // 빈배열을 넣을 시 값이 -999999가 나옴
		System.out.println("최대값:" + max(new int[] {})); // 빈배열을 넣을 시 값이 -999999가 나옴
		
		
	}

}
