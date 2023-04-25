package str;

import java.util.ArrayList;

public class Exam01 {
	public static void main(String[] args) {
		
		String str = "Have a nice day Have a nice day Have a nice day";
	    char target = 'a';
	    ArrayList<Integer> arr = new ArrayList<>();

	    for (int i = 0; i < str.length(); i++) { //반복횟수는 문자 크기만큼
	      if (str.charAt(i) == target) {	//문자열의 요소가 a라면 그것의 인덱스번호 출력
	        arr.add(i);
	      }
	    }

	    System.out.println(arr);
	  }
	}