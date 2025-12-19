import java.util.Scanner;
public class Heights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float height = sc.nextInt();
        float inches = height*0.393701f;
        int feet = (int)inches/12;
        float inch = inches-(feet*12);
        System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inch);
    }
}
