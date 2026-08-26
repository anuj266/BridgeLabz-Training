import java.util.*;

public class PasswordValidation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String password=sc.nextLine().trim();
        System.out.println(isPasswordValid(password));
    }

    static boolean isPasswordValid(String password){
        String pattern="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%&*]).{8,}$";
        return password.matches(pattern);
    }
}