package ex9;

public class Contains {
	
	
	public static boolean contains(String src, String target) {
		
	
		if(src.indexOf(target,0)!=-1)
			return true;
		else
			return false;
		
		
	}
		
		
	public static void main(String[] args) {
		// 첫 번째 문자열(src)에 두 번째 문자열(target)이 포함되어 있는지 확인한다.
		// 포함되어 있으면  true 그렇지 않으면 false를 반환

		
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
		
	}

}


	