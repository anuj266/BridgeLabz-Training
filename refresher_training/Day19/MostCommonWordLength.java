import java.util.*;
public class MostCommonWordLength
{   
	public static void main(String[] args) {
	   //Most Common Word Length
	   String[] list={"ryuga","gojo","sukuna","tobi"};
	   HashMap<Integer,Integer> map=new HashMap<>();
	   for(String s:list){
	       map.put(s.length(),map.getOrDefault(s.length(),0)+1);
	   }
	   int max=-1;
	   int k=0;
	   for(int key:map.keySet()){
	       if(map.get(key)>max){
	           max=map.get(key);
	           k=key;
	       }
	   }
	   System.out.println(k);
	}
	
	
	
}