// package core-java-practice.gcr-codebase.programming-elements;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float radius = sc.nextFloat();
        Double area = 3.14*radius*radius;
        System.out.println(area);
    }
}
