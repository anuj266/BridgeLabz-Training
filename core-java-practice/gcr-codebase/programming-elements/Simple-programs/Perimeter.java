import java.util.Scanner;

class Perimeter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breath = sc.nextInt();
        int perimeter = 2*(length+breath);
        System.out.println(perimeter);

    }
}