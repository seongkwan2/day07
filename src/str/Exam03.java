package str;

public class Exam03 {
	public static void main(String[] args) {
		
		String str = "tESt sTring   change     first";
	    String[] words = str.split("\\s+");
	    StringBuilder sb = new StringBuilder();

	    for (int i = 0; i < words.length; i++) {
	      if (!words[i].isEmpty()) {
	        char[] charArray = words[i].toCharArray();
	        charArray[0] = Character.toUpperCase(charArray[0]);
	        sb.append(new String(charArray));
	      }
	      sb.append(" ");
	    }

	    String changeStr = sb.toString().trim();

	    System.out.println("변경전 : " + str);
	    System.out.println("변경후 : " + changeStr);
	  }
	}