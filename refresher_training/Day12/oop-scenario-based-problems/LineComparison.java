import java.util.*;

public class LineComparison{

    static class Line{
        int x1;
        int y1;
        int x2;
        int y2;

        Line(int x1, int y1, int x2, int y2){
            this.x1=x1;
            this.y1=y1;
            this.x2=x2;
            this.y2=y2;
        }

        double getLineLength(){
            return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        }

    }


    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinates of line");

        Line l1=new Line(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());

        System.out.println("Enter the coordinates of line");
        Line l2=new Line(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());

        double length1 = l1.getLineLength();
        double length2 = l2.getLineLength();

        if (length1 == length2) {
            System.out.println("Both lines are equal");
        } else if (length1 < length2) {
            System.out.println("l1 is smaller than l2");
        } else {
            System.out.println("l1 is bigger than l2");
        }
    }
}