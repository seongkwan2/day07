package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		//HashMap<String, String> map = new HashMap<>();
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		//순서를 유지하고 싶으면 LinkedHashMap 사용

		map.put("name", "홍길동");
		map.put("age", "20");
		map.put("addr", "산골짜기");
		System.out.println(map);
		
		//Set<String> set = map.keySet();
		//Iterator<String> it = set.iterator();	//두줄의 코드를 한줄로 생략
		Iterator<String> it = map.keySet().iterator();
								
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " +map.get(key));
							//values를 따로 추출하는것이 아닌
							//키를 통해 값을 추출하는 방식
		}
	}
}
