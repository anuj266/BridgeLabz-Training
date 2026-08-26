import java.util.*;

public class ListQueries {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            String todo=sc.next();
            if(todo.equals("Insert")){
                int x=sc.nextInt();
                int y=sc.nextInt();
                list.add(x,y);
            }else{
                list.remove(sc.nextInt());
            }   
        }
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}
