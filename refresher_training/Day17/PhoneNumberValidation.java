import java.util.*;

public class PhoneNumberValidation{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String number=sc.nextLine().trim();
        System.out.println(isNumberValid(number));
    }

    static boolean isNumberValid(String number){
        String pattern="^(\\+\\d{1,3})?\\s?(\\d{10}|\\d{3}-\\d{3}-\\d{4})$";
        return number.matches(pattern);
    }
}