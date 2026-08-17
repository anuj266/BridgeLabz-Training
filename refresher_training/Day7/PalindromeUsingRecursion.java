import java.util.*;

public class PalindromeUsingRecursion {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reversedString=reverse(A,0);
        System.out.println(A.equals(reversedString)?"Yes":"No");
        sc.close();
        
    }
    
    private static String reverse(String A, int i){
        if(i>=A.length()) return "";
        return reverse(A,i+1)+A.charAt(i);
        
    }
}



