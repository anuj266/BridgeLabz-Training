package scenrio_based;

import java.util.Scanner;

public class SentenceFormatterScenrio2 {
	public static int countNumberOfWords(String str) {
		int count = 1;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isWhitespace(ch)) {
				count++;
			}
		}
		return count;
	}
	public static String longestWord(String str) {
		String[] words = str.split(" ");
        String longest = "";
        for(String word:words) {
        	if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
	}
	public static String replaceWords(String str , String str1 , String str2) {
		String result = str.replaceAll("\\b"+str2+"\\b", str1);
		return result;
	}
	public static String removeExtraSpace(String str) {
		String result = str.replaceAll("\\s+", " ");
		return result;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		if(str.length()==0) {
			System.out.println("Paragraph is empty");
			return;
		}
		str = removeExtraSpace(str);
		int count = countNumberOfWords(str);
		String longest = longestWord(str);
		System.out.println(count);
		System.out.println(longest);
		System.out.println("Enter the word you want to add");
		String str1 = input.nextLine();
		System.out.println("Enter the word you want to replace");
		String str2 = input.nextLine();
		str = replaceWords(str,str1,str2);
		System.out.println(str);
		input.close();
		
	}
}
