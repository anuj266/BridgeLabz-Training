import java.util.*;

public class Main {
    static boolean isVowel(char c){
        c=Character.toUpperCase(c);
        return c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
    static boolean invalid(String s){
        return s.trim().contains(" ");
    }
    static String firstTwoUnique(String s,boolean wantVowel){
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(int i=0;i<s.length()&&set.size()<2;i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                if(isVowel(c)==wantVowel)set.add(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:set)sb.append(c);
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first word");
        String w1=sc.nextLine();
        if(invalid(w1)){
            System.out.println(w1+" is an invalid word");
            return;
        }
        System.out.println("Enter the second word");
        String w2=sc.nextLine();
        if(invalid(w2)){
            System.out.println(w2+" is an invalid word");
            return;
        }
        String r1=new StringBuilder(w1).reverse().toString();
        if(r1.equalsIgnoreCase(w2)){
            String t=r1.toLowerCase();
            StringBuilder out=new StringBuilder();
            for(int i=0;i<t.length();i++){
                char c=t.charAt(i);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')out.append('@');
                else out.append(c);
            }
            System.out.print(out.toString());
        }else{
            String comb=(w1+w2).toUpperCase();
            int v=0,con=0;
            for(int i=0;i<comb.length();i++){
                char c=comb.charAt(i);
                if(Character.isLetter(c)){
                    if(isVowel(c))v++;
                    else con++;
                }
            }
            if(v>con)System.out.print(firstTwoUnique(comb,true));
            else if(con>v)System.out.print(firstTwoUnique(comb,false));
            else System.out.print("Vowels and consonants are equal");
        }
    }
}
