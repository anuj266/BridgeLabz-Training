public class ReverseString
{
	public static void main(String[] args) {
		//reverse a string or throw exception if digit 
		String s1="meow";
		String s2="22";
		System.out.println(reverse(s1));
		System.out.println(reverse(s2));
	}
	
	private static String reverse(String s){
	    if (s == null) {
            return null; 
        }
	    StringBuilder sb=new StringBuilder();
	    for(int i=s.length()-1;i>=0;i--){
	        if(Character.isDigit(s.charAt(i))){
	            throw new IllegalArgumentException("Invalid input");
	        }
	        sb.append(s.charAt(i));
	    }
	    return sb.toString();
	}
}