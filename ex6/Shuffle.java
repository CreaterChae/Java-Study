package ex6;

public class Shuffle {
	// 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 하고 값을 반환한다.
	public static int[] shuffle(int[] arr) {
	
		if( arr == null || arr.length == 0) 
			return arr; // 매개변수로 어떤 값이 넘어올지 모르기 때문에 하는 유효성 체크 검사
		
		for(int i = 0; i < arr.length; i++) {
			int j = (int)(Math.random() *arr.length);
		
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			}
		
		return arr;
		
		}

	public static void main(String[] args) {
		
		int[] original = { 1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
	}

}
