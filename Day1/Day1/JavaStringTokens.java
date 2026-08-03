
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        if(s.isEmpty()){
            System.out.println(0);
            return;
        }
        String[] str=s.split("[ !,?._'@]+");
        System.out.println(str.length);
        for(String word:str){
            System.out.println(word);
        }
        scan.close();
    }
}

