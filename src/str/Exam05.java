package str;

public class Exam05 {


	public static void main(String[] args) {
		String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
	    String newStr = str.replaceAll("-\\d{4}", "1999");

	    System.out.println("====변경 전 str====");
	    System.out.println(str);
	    System.out.println();
	    System.out.println("====변경 후 str====");
	    System.out.println(newStr);
	  }
	}