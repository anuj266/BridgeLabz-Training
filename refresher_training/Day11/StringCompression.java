import java.util.*;
public class StringCompression{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s==null || s.isEmpty()){
            System.out.println("Compression not possible on empty string");
        }
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt((i))==s.charAt(i-1)){
                count++;
            }else{
                sb.append(s.charAt(i-1));
                if(count>1){
                    sb.append(count);
                }
                count=1;
            }
        }
        sb.append(s.charAt(s.length()-1));
        if(count>1){
            sb.append(count);
        }
        System.out.println(sb);
    }
}