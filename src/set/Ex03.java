package set;

import java.util.HashSet;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<String> name = new HashSet<>();
		
		String n;
		while(true) {
			System.out.println("이름 입력: ");
			n = scan.next();
			boolean bool = name.add(n); //set은 중복이 안되니까
										//중복이 되면 false가 나온다.
			System.out.println(bool);
			if(!bool) { //bool == false (false가 나오면 true가 나오게 !반전시켜준다.)
						//중복이 되면 존재하는 이름입니다가 출력되게 하는것.
				System.out.println("존재하는 이름입니다.");
			}else {
				System.out.println("저장 완료");
			}
		}
	}
}
















