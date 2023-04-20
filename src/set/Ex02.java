package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		
		Iterator<String> it = arr.iterator();
		//[bof aaa bbb ccc eof]
		// if
		
		/*
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext()); //hasNext는 it의 위치를 판단하는것
										  //다음 데이터가 없으면 false
		*/
		//while(it.hasNext()){
		for(; it.hasNext() ; ) {
			System.out.println(it.next());
		}
		
		HashSet<String> set = new HashSet<>();
		set.add("set aaa");
		set.add("set bbb");
		set.add("set ccc");
		
		Iterator<String> ite = set.iterator();
		for(; ite.hasNext() ;) {
			System.out.println(ite.next());
		}

	}
}











