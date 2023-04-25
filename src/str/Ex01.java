package str;

public class Ex01 {
	public static void main(String[] args) {
		
		//스트링의 기능
		
		String s = new String();
		s = "aBCd";
		System.out.println(s);
		
		s = s.toUpperCase();	//대문자로 저장
		System.out.println(s);
		System.out.println(s.toLowerCase()); //소문자로 출력
		
		System.out.println(s.charAt(0));	//인덱스와 같은 개념
		System.out.println(s.charAt(1));
		
		char ch = s.charAt(0);	//캐릭터로 저장가능
		
	}
}
