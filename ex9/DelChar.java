package ex9;

public class DelChar {

	public static String delchar(String src, String delch) {
		
	StringBuffer sb = new StringBuffer(src.length());
	for(int i =0; i < src.length(); i++) {
		char ch = src.charAt(i);
		
		if(delch.indexOf(ch)==-1)
			sb.append(ch);
	}
			return sb.toString();
	}
		
//		
//		if(src.indexOf(delch,0)!=-1) {
//			return src.charAt(src.indexOf(delch,0));
//		}
//	
	public static void main(String[] args) {
		// 주어진 문자열에서 금지된 문자들을 제거하여 반환한다.

		System.out.println("(1!2@3^4~5)" + "->" + delchar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println("(1 2 3 4 \t5)" + "->" + delchar("(1 2 3 4 \t5)","\t"));
	}

}
