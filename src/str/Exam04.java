package str;

public class Exam04 {
	public static void main(String[] args) {
		String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
		//위와 같은 내용을 replace를 이용해서 아래와 같이 저장후 출력하시오.
		
		// ====변경 전 str====
		// 김개똥 -2017년
		// 홍길동구리 -2015년
		// 선우선녀 -2018년
		
		// ====변경 후 str====
		// 김개똥: 1999년
		// 홍길동구리: 1999년
		// 선우선녀: 1999년
		
		//변경전
		System.out.println("====변경 전 str====");
		System.out.println(str);
		
		System.out.println();
		//변경후
		System.out.println("====변경 후 str====");
		str = str.replaceAll("-\\d{4}", ":1999");
		
		System.out.println(str);
		
		
		
	}
}















