package ex6;

public class IsNumber2 {

	// 주어진 문자열이 모두 숫자로만 이뤄져 있는지 확인한다.
	public static boolean isNumber (String str) { // str을 받아 동작하는 메서드이니 매개변수는 String str
		
		if(str == null || str.equals(""))
			return false; // 유효성 검사
		
		for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i); //문자열의 i번째를 ch 변수에 저장
			
			if(ch < '0' || ch > '9') // ch가 0~9 사이가 아니라면(숫자가 아니라면) false
				return false;
			
		} // 여기까지가 for문
	
	
		return true; // 이외의 경우에는 무조건 true
		
	}
			
	
	public static void main(String[] args) {
		
		String str = "123";
		System.out.print(str + "는 숫자입니까?" + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
				
				
				
				
	}

}
