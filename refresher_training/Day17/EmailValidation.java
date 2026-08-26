import java.util.*;

public class EmailValidation{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine().trim();
        System.out.println(isValid(email));
    }

    static boolean isValid(String email){
        String pattern="^[a-zA-Z0-9.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(pattern);
    }
}