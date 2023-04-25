package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", "20");
		map.put("addr", "산골짜기");
		
		System.out.println(map.keySet());	//keySet으로 키만 출력가능
		System.out.println(map.values());	//values로 값만 출력가능
		System.out.println(map);
		
		
		//응용
		Set<String> key_set = map.keySet();	//keySet으로 추출한것을 Set형태로 저장
		System.out.println(key_set);		//키만 갖고있음
		
		Collection<String> value_co = map.values();
											//values로 추출한것을 Collection형태로 저장
											//값만 갖고있음
		System.out.println(key_set);
		System.out.println(value_co);
		
		Iterator<String> keyIt = key_set.iterator();	//Set에서 값을 빼낼때는 Iterator 사용
		Iterator<String> valueIt = value_co.iterator();
		
		while(keyIt.hasNext()) {				//반복문에 hasNext()를 사용해서 값 추출
			String k = keyIt.next();	//next로 한개씩 검사하면서 값이 있으면 출력되는 형식
			String v = valueIt.next();
			System.out.println(k+" : "+v);
			
		}
		
	}
}













