package str;

import java.util.ArrayList;

public class Exam02 {
	public static void main(String[] args) {
		//It is a fun java programming 문자열에서 
		//'a'의 개수와 'g'개수와 총 개수를 출력하시오
		//총 개수: 28
		//a	개수: 4
		//g 개수: 2

		String str = "It is a fun java programming";
		char tag_a = 'a';
		char tag_g = 'g';
		int a = 0;
		int g = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==tag_a) {
				a++;
			}
			if(str.charAt(i)==tag_g) {
				g++;
			}
			
		}
		System.out.println("총 개수: "+str.length());
		System.out.println("a 개수: "+a);
		System.out.println("g 개수: "+g);
		
		
	}
}
