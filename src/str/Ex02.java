package str;

public class Ex02 {
	public static void main(String[] args) {
		
		//int형식을 string형식으로 바꾸는 방법
		int num = 1111;
		String st = num+"";
		System.out.println(st+num);	// -> 111111111
		
		//string 형식을 int형식으로 바꾸는 방법
		int n = Integer.parseInt("1111");
		System.out.println(n + num); 	//-> 2222
		
		//String을 더하면 뒤에 차곡차곡 쌓인다.
		String st02 = "";
		st02 += "a";
		st02 += 'b';
		st02 += (char)('c' - 32); //c를 아스키코드로 변환하면 99다. 99-32 = 67인데
								  //67은 대문자 C 이다.
		System.out.println(st02);
	}
}
