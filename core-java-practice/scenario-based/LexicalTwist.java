//package scenrio;
//
//import java.util.Scanner;
//
//public class LexicalTwist {
//	static boolean checkReverse(String str1 , String str2) {
//		if (str1.length() != str2.length()) {
//            return false;
//        }
//        int j = str2.length() - 1;
//        for (int i = 0; i < str1.length(); i++) {
//            if (str1.charAt(i) != str2.charAt(j)) {
//                return false;
//            }
//            j--;
//        }
//        return true;
//	}
//	static String updation(boolean checkReverse , String str1) {
//		if(checkReverse) {
//			StringBuilder sb = new StringBuilder();
//			str1.toLowerCase();
//			for(int i=str1.length();i>=0;i--) {
//				if(str1.charAt(i)=='a' ||str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u' ) {
//					
//				}
//				sb.append(str1.charAt(i));
//			}
//			
//		}
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the First Word");
//		String str1 = sc.nextLine();
//		System.out.println("Enter the Second Word");
//		String str2 = sc.nextLine();
//		
//	}
//}
