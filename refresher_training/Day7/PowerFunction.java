import java.util.Scanner;
public class PowerFunction{
    static int fastCalls=0;
    static int normalCalls=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pow=sc.nextInt();
        int result1=fastPow(num,pow);
        int result2=pow(num,pow);
        System.out.println("fastPow : "+result1);
        System.out.println("fastcalls : "+fastCalls);
        System.out.println("normalPow : "+result2);
        System.out.println("normalcalls : "+normalCalls);
    }

    private static int fastPow(int num, int pow){
        fastCalls++;
        if(pow==0) return 1;
        int half=fastPow(num,pow/2);
        if(pow%2==0){
            return half*half;
        }else{
            return half*half*num;
        }
    }

    private static int pow(int num,int pow){
        normalCalls++;
        if(pow==0) return 1;
        return num*pow(num,pow-1);
    }
}
