package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Exam02 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = 0;
      LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
      String menu = null;
      int pri = 0;
      
      while(true) {
         System.out.println("1.메뉴 등록");
         System.out.println("2.메뉴별 가격 보기");
         System.out.println("3.종료");
         System.out.print(">>>");
         num = input.nextInt();
         
         switch(num) {
         case 1 : System.out.print("등록할 메뉴를 입력하세요 : ");
                menu = input.next();
                if(map.containsKey(menu)) {
                   System.out.println("이미 존재하는 메뉴입니다.");
                }else {
                   System.out.print("가격을 입력하세요 : ");
                   pri = input.nextInt();
                   map.put(menu, pri);
                   System.out.println("메뉴가 등록되었습니다.");
                }
                break;
                
         case 2 : 
                boolean a = true;
                while(a) {
                   System.out.println("--- 메뉴판 ---");
                   Iterator<String> it = map.keySet().iterator();
                   if(!it.hasNext()) {
                      System.out.println("메뉴가 없습니다.");
                      break;
                   }
                   while(it.hasNext()) {
                      String key = it.next();
                      System.out.println(key + " : " + map.get(key));
                   }
                   System.out.println("1.수정 2.삭제 3.나가기");
                   System.out.print(">>>");
                   num = input.nextInt();
                   switch(num) {
                   case 1 : System.out.print("수정할 메뉴 : ");
                              menu = input.next();
                              if(map.containsKey(menu)) {
                                 System.out.print("수정할 가격 : ");
                                 pri = input.nextInt();
                                 map.put(menu, pri);
                                 System.out.println("수정 되었습니다.");
                              }else {
                                 System.out.println("없는 메뉴입니다.");
                              }
                              break;
                   case 2 : System.out.print("삭제할 메뉴 : ");
                           menu = input.next();
                           if(map.containsKey(menu)) {
                              map.remove(menu);
                              System.out.println("삭제되었습니다.");
                           }else {
                              System.out.println("없는 메뉴입니다.");
                           }
                           break;
                   case 3 : a = false;
                   }
                }
                break;
         case 3 : System.out.println("프로그램을 종료합니다.");
                System.exit(1);
         }
         
      }
   }
}