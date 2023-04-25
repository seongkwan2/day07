package random;

import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		//랜덤함수 Math.random();
		System.out.println(Math.random());
		
		for(int i=0; i<5; i++) {
			double ran = Math.random();
			System.out.println((int)(ran*3)+10);
		}
	}
}
