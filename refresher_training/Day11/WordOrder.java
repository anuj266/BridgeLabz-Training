import java.util.*;
public class WordOrder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            String word=sc.next();
            map.put(word,map.getOrDefault(word,0)+1);
        }
        System.out.println(map.size());
        for(String key:map.keySet()){
            System.out.println(key+" -> "+map.get(key));
        }
        sc.close();
    }
}