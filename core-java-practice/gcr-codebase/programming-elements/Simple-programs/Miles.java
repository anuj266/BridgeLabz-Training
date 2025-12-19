// package core-java-practice.gcr-codebase.programming-elements;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float kilometer = sc.nextFloat();
        Double miles = 0.621371*kilometer;
        System.out.println(miles);
    }
}
