package set;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
//		ArrayList 선언 후 10부터 100까지 10단위로 넣어주세요(반복문 이용)
//		그후 10이 들어있는 다음 인덱스에 15 를 넣어주세요 (10이 들어있는지 확인)
//		그후 60을 600으로 수정하고 90을 삭제한다음 (60,90이 들어있는지 확인)
//		ArrayList를 출력해주세요
		
		int i = 0;
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(i=1; i<=10; i++) {
			arr.add(i*10);
		}
		
		for(i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		arr.add(1,15);
		System.out.println(arr);
		
		
		arr.set(6, 600);
		arr.remove(9);
		
			System.out.println(arr);
		
	}
}












