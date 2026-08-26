
public class ValidName
{
	public static void main(String[] args) {
		//valid name
		String name="293492";
		String valid="^[a-zA-Z]+$";
		System.out.println(name.matches(valid));
	}
}