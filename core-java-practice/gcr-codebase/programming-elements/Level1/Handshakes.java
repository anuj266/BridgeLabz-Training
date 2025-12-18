package Level1;

import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfHandshakes = sc.nextInt();
        int possible = (numberOfHandshakes*(numberOfHandshakes-1))/2;
        System.out.println("Possible Handshakes by the "+numberOfHandshakes+" students are "+possible);
    }
}
