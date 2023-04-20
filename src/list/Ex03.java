package list;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa"); // 0
		arr.add("bbb"); // 1
		arr.add("ccc"); // 2
		System.out.println(arr.indexOf("bbb"));
		System.out.println(arr.indexOf("bbb22")); //해당하는 값이 없으면 -1 출력
		System.out.println("==== set ====");
		
		System.out.println(arr);
		arr.remove("bbb");
		arr.add("bbb");		//그냥 추가하면 마지막에 추가가 된다.
		arr.add(1,"홍길동");	//중간에 넣고싶으면 인덱스(번호) 작성
		System.out.println(arr);
		
		arr.set(1, "김개똥");	//set을 이용해서 데이터의 내용을 삭제없이 수정가능
		System.out.println(arr);
	}
}













