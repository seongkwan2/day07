package list;

import java.util.ArrayList;

/*
 collection
 - 데이터의 집합 구조
 - []
 
 framework
  -기본 틀
  
 collection framework
 - List
 	- 순서가 존재한다.
 	- 데이터의 중복은 허용 가능
 - Map :
 - Set : 
 */

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		System.out.println(arr.size());
		for(int i=0; i<3; i++) {
			System.out.println(arr.get(i));
		}
		
		//향상된 for문으로 빼올수 있음
		System.out.println("===for each ===");
		for(String s: arr) {//타입명 새로운변수명: 기존변수명
			System.out.println(s);
		}
		
		System.out.println("===============");
		int n1 = 100;
		Integer n2 = 200;
		System.out.println(n1+", "+n2);
		
		ArrayList<Integer> arr02 = new ArrayList<>();
		arr02.add(111);
		//arr02.add("111");		//자료형이 Integer라 정수형만 저장가능

	}
}























