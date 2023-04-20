package set;

import java.util.ArrayList;

public class Ex07 {
	public static void main(String[] args) {

	
	/*ArrayList<Integer> arr = new ArrayList<>();
	for(int i = 1; i <= 10; i++) {
		arr.add(i*10);
	}

	if(arr.contains(10)) {
		arr.add(arr.indexOf(10)+1, 15);
	}
	int num = arr.indexOf(60);
	if(num != -1) {
		arr.set(num, 600);
	}

	int num1 = arr.indexOf(90);
	if(arr.contains(90)) {
		arr.remove(num1);
	}

	System.out.println(arr);
*/
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			arr.add(i*10);
		}
		
		if(arr.contains(10)) {
			arr.add(arr.indexOf(10)+1, 15);
		}
		if(arr.contains(60)) {
			arr.set(arr.indexOf(60), 600);
			arr.remove(arr.indexOf(90));
		}
		System.out.println(arr);
		
		
}
}
