package set;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01 {
	public static void main(String[] args) {
	/*
	 set
	 - 순서가 존재하지 않는다.
	 - 데이터의 중복을 허용하지 않는다.
	 - 배열을 안의 공간을 16개로 잡고 75%가 차면 
	 	새롭게 16개의 공간 생성한다. 공간은 유동적이다.
	 */
		
		//HashSet과 ArrayList 비교 
		
		HashSet<String> set = new HashSet<>();
		set.add("aaa");
		set.add("bbb");
		set.add("aaa");
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("aaa");
		
		System.out.println("set :"+set);	//set은 순서가 랜덤, 중복허용X
		System.out.println("arr :"+arr);
		
		System.out.println("==== remove ====");
		set.remove("bbb");	//set은 인덱스가없으므로 데이터를 입력해서 삭제한다.
		System.out.println(set);
	}
}











