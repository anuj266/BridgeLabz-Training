public class VowelString
{   
	public static void main(String[] args) {
	   //Words Starting and Ending with Vowels
	   String word="akdbabkcde";
	   String valid="^[aeiou].*[aeiou]$";
	   System.out.println(word.matches(valid));
	}
	
	
}