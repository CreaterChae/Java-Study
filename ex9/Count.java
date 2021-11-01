package ex9;

public class Count {
	
	public static int count(String src, String target) {
	
		int count = 0;
		int pos = 0;
	
		while(true) {
			
			pos = src.indexOf(target,pos);
			
			if(pos!=-1) {
				++count;
				pos += target.length();
			}
			else {
				break;
			}
		}

			return count;
	}
		
		
	
	public static void main(String[] args) {
		// 주어진 문자열(src)에 찾으려는 문자열(target)이 몇 번 나오느지 세어서 반환한다.
		
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
		
		
		
		
	}

}
