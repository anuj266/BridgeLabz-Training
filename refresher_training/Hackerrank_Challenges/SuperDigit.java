import java.util.*;
public class SuperDigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Enter the repitition value: ");
        int k=sc.nextInt();
        int val=Integer.parseInt(String.valueOf(n).repeat(k));
        System.out.println(superDigit(val));
    }

    private static int superDigit(int val){
        if(val<10) return val;
        return superDigit(digitSum(val));
    }

    private static int digitSum(int val){
        if(val<10) return val;
        return val%10+digitSum(val/10);
    }
}
