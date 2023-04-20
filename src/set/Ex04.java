package set;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		//연락처 저장 프로그램 만들기

		Scanner scan = new Scanner(System.in);
		boolean bool = true;
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> call = new ArrayList<>();
		String na,ca;	//이름과 번호를 받기위한 변수


		while(bool) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.println(">>>");
			int menu=scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("등록할 이름 입력: ");
				na = scan.next();
				if(name.indexOf(na) == -1) { //-1(중복되지 않으면 저장)
					name.add(na);	//받아놨던 이름을 추가
					System.out.println("등록할 연락처를 입력: ");
					ca = scan.next(); //번호 받기
					call.add(ca);	//받아놨던 연락처 추가
				}else {
					System.out.println("중복된 이름 입니다.");
				}break;

			case 2:
				System.out.println("====연락처 보기====");
				for(String s:name) {//모든사람의 이름 출력
					System.out.println(s);
				}
				System.out.println("확인하고 싶은 사람의 이름 입력: ");
				na = scan.next();
				if(name.indexOf(na) == -1) {
					System.out.println("해당 이름이 존재하지 않습니다.");
				}else {
					System.out.println(na+" 님의 연락처는 "+call.get(name.indexOf(na))+ "입니다.");
				}										//모든전화번호에서 name.indexOf(na)와 같은 값 출력
				break;

			case 3:
				System.out.println("====연락처 삭제====");
				for(String s:name) {//모든사람의 이름 출력
					System.out.println(s);
				}
				if(name.size()==0) {//정보가 없으면
					System.out.println("저장된 연락처가 없습니다.\n");
				}
				else {//있으면
					System.out.println("어떤 사람의 연락처를 삭제할까요?: ");
					na = scan.next();
					if(name.indexOf(na)==-1) {
						System.out.println("해당 이름이 존재하지 않습니다.");
					}else {
						System.out.println(na+"님의 연락처를 삭제합니다.");
						name.remove(na);
					}break;
				}
			case 4:
				System.out.println("====모든 연락처 보기====");
				if(name.size()==0) {
					System.out.println("저장된 연락처가 없습니다.\n");
				}else {
					for(int i=0; i<name.size(); i++) {
						System.out.println("<이름>: "+name.get(i)+" <연락처>: "+call.get(i));
					}
				}
			case 5:
				System.out.println("종료합니다.");
				bool = false;
			}
		}
	}
}

















