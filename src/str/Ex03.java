package str;

public class Ex03 {
	public static void main(String[] args) {
		
		//공백 제거 기능 
		//변수명.trim();
		String id = "test"         ;
		id = id.trim();
		System.out.println(id+"!");
		if(id.equals("test")) {
			System.out.println("인증통과");
		}else {
			System.out.println("인증실패");
		}
		
		//글자를 배열로 나누는 기능
		//String[] 변수명 = 변수명.split("기준문자");
		String addr = "우편번호/주소/상세주소";
		String[] s = addr.split("/");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println("addr : "+addr);
		
		
		//글자를 바꾸는 기능
		//변수명.replace("기존문자","바꿀문자");
		addr = addr.replace("/", "=>");
		System.out.println("addr : "+addr);
	}
}













