package ex9;

import java.util.*;
import java.util.regex.*;

public class PhoneNumber {
// 화면에서 전화번호의 일부를 입력받아 일치하는 전화번호를 주어진 문자열 배열에서 찾아 출력하는 프로그램
	
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"010-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
				"013-3456-7890"
		};
	
	ArrayList list = new ArrayList();
	Scanner s = new Scanner(System.in);
	
	while (true) {
		System.out.print((">"));
		String input = s.nextLine().trim();
		
		if (input.equals("")) {
			continue;
		}
		else if (input.equalsIgnoreCase("Q")) {
			System.exit(0);
	}	
	
		String pattern = ".*"+input+".*"; // input을 포함하는 모든 문자열
		Pattern p = Pattern.compile(pattern); // 문자열을 패턴으로 만듦
		
		for(int i =0; i<phoneNumArr.length; i++) {
			String phoneNum = phoneNumArr[i];
			String tmp = phoneNum.replace("-", ""); // phoneNum에서 -를 제거
		
			Matcher m = p.matcher(tmp); // 대상 문자열과 패턴 일치하는지 확인
			
			if(m.find()) { // 패턴과 일치하면, list에 phoneNum을 추가함
				list.add(phoneNum);
			}
			
		}

		
		
		
		if(list.size() > 0 ) {
			System.out.println(list);
			list.clear();
		}	else {
			System.out.println("일치하는 번호가 없습니다.");
		}
		
	
	
	}
	
	
	

	}
}
