
public class MaxEvenLenSubstring
{   
	public static void main(String[] args) {
	   //— Maximum Even-Length Substring
	   String s = "abcde";
        String answer = maxEvenSubstring(s);
        System.out.println(answer);
    }
	static String maxEvenSubstring(String s) {
        int n = s.length();
        if (n % 2 == 0) {
            return s;
        }
        return s.substring(0, n - 1);
    }
	
	
}