import java.util.*;
public class PalindromeIn2D
{   
	public static void main(String[] args) {
		//Count Palindromic Strings in a 2D List
	    List<List<String>> list=new ArrayList<>();
        list.add(Arrays.asList("madam", "hello", "level"));
        list.add(Arrays.asList("java", "racecar", "world"));
        list.add(Arrays.asList("noon", "abc", "aba"));
        int count = countPalindromes(list);
        System.out.println("Total palindromic strings = " + count);
	}
	
	static int countPalindromes(List<List<String>> list) {
        int count = 0;
        for (List<String> innerList : list) {
            for (String s : innerList) {
                if (isPalindrome(s)) {
                    count++;
                }
            }
        }
        return count;
    }
	
	static boolean isPalindrome(String s){
	    int i=0,j=s.length()-1;
	    while(i<j){
	        if(s.charAt(i)!=s.charAt(j)){
	            return false;
	        }
	        i++;
	        j--;
	    }
	    return true;
	}
	
}