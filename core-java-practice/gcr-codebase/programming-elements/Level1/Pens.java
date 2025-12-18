public class Pens {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int equalPens = pens/students;
        int notdistributed = pens%students;
        System.out.println("The pen per student is " +equalPens+ " and the remaining pen not distributed is "+notdistributed);
    }
}
