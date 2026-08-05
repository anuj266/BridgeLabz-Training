import java.util.*;
public class ReverseWord{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine().trim();
        String[] arr=line.split(" ");
        StringBuilder result=new StringBuilder();
        for(String s:arr){
            StringBuilder sb=new StringBuilder(s);
            result.append(sb.reverse()).append(" ");
        }
        System.out.println(result.toString());
    }
}