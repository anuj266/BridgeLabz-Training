package scenrio_based;

import java.util.Scanner;

public class SentenceFormatterScenrio1 {
	public static String spaceAfterPunctuation(String str) {
		String result = str.replaceAll("\\p{Punct}", "$0 ");
		return result;
	}
	public static String capitalLetterAfterSpace(String str) {
		StringBuilder sb = new StringBuilder();
		boolean capitalzeNext = true;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isWhitespace(ch)) {
				sb.append(ch);
				capitalzeNext = true;
			} else if(capitalzeNext){
				sb.append(Character.toUpperCase(ch));
				capitalzeNext = false;
			}
			else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	public static String removeExtraSpace(String str) {
		String result = str.replaceAll("\\s+", " ");
		return result;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine().trim();
		str = removeExtraSpace(str);
		str = spaceAfterPunctuation(str);
		str = capitalLetterAfterSpace(str);
		System.out.print(str);
		input.close();
		
		
	}
}
