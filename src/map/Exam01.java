package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {

		int cho = 1;	//프로그램선택
		int men_cnt = 0; //메뉴번호
		String men = null; //메뉴이름
		String menck = null; //메뉴비교(수정,삭제)
		String money = null; //메뉴가격
		boolean bool = true; //코드종료
		LinkedHashMap<String, String> menu = new LinkedHashMap<>(); //메뉴 menu
		Scanner scan = new Scanner(System.in);

		while(bool) {
			System.out.println("1.메뉴등록\n2.메뉴별 가격보기\n3.종료\n>>>");
			cho = scan.nextInt();

			switch(cho) {
			case 1:
				System.out.println("등록하실 메뉴를 입력해주세요.\n>>>");
				men = scan.next();
				if(menu.containsKey(men)) {
					System.out.println("메뉴가 존재합니다.\n");
				}else {
					System.out.println("등록하신 메뉴의 가격을 입력해주세요\n>>>");
					money = scan.next();
					menu.put(men, money);
					System.out.println("메뉴를 등록했습니다.\n");
				}
				break;

			case 2:
				while(bool) {
					System.out.println("====메뉴별 가격 보기====");
					Iterator<String> it = menu.keySet().iterator();
					while(it.hasNext()) {
						String key = it.next();
						int i = 1;
						i++;
						System.out.println(i+"."+key+" : "+menu.get(key));//수정필요
					}
				}
				System.out.println("1.수정\n2.삭제\n3.나가기\n>>>");
				cho = scan.nextInt();

				switch(cho) {
				case 1:
					System.out.println("수정할 메뉴를 입력해주세요\n>>>");
					menck = scan.next();

					if(!menu.containsKey(menck)) {
						System.out.println("메뉴가 존재 하지 않습니다.\n");
					}else {
						System.out.println(menck+"의 가격을 수정합니다.");
						System.out.println("얼마로 수정하실건가요?\n>>>");
						menck = scan.next();
						menu.put(menck, menck);
						System.out.println(menck+"의 가격을 "+menck+" 원으로 수정되었습니다.");
					}
					break;

				case 2:
					System.out.println("삭제할 메뉴를 입력해주세요\n>>>");
					menck = scan.next();

					if(!menu.containsKey(menck)) {
						System.out.println("메뉴가 존재 하지 않습니다.");
					}else {
						System.out.println(menck+"를 메뉴에서 삭제합니다.");
						menu.remove(menck);
						System.out.println("해당 메뉴가 삭제되었습니다.");
					}
					break;
				case 3: 
					System.out.println("초기화면으로 돌아갑니다.");
					break;
				}
			case 3 : System.out.println("프로그램 종료");
			bool = false;
			
			}
		}
	}
}