package ex5;

public class Arr {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]; 
			}
		
			System.out.println("sum=" + sum);
		
			int[][] arr1 = {
					{5,5,5,5,5},
					{10,10,10,10,10},
					{20,20,20,20,20},
					{30,30,30,30,30}
			};

			int total = 0;
			double average = 0;
			
			for (int i =0; i < arr1.length; i++) {
				for(int j=0; j < arr1[i].length; j++)  {
					
					total += arr1[i][j];
					average = total/(arr1.length*arr1[0].length); }
					
	}
	
		System.out.println("total=" + total);
		System.out.println("average=" + average);
		
						
			}
		}



