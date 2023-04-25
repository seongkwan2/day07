package random;

import java.util.ArrayList;

public class Exam01 {
	public static void main(String[] args) {
		//로또 프로그램을 만들어라 (1~45까지 6개의 중복되지 않는 숫자)
		//(ArrayList, HashSet, HashMap 만들어서 진행)
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<6; i++) {
			double ran = Math.random();
			int num = (int)(ran*45)+1;
			if(arr.contains(num)) {
				i--;
			}else {
				arr.add(num);
			}
		}
		System.out.println(arr);
	}
}
