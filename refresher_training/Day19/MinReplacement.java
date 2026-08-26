public class MinReplacement
{   
	public static void main(String[] args) {
	   //— Minimum Replacements for Valid Adjacent Characters
	   String s = "aabb";
       System.out.println(minReplacements(s));
    }
	static int minReplacements(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i - 1)) <= 1) {
                count++;
                i++;
            }
        }
        return count;
    }
	
	
}