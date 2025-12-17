// package core-java-practice.gcr-codebase.programming-elements;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float celsius = sc.nextFloat();
        Float fahrenhite = (celsius*9/5)+32;
        System.out.println(fahrenhite);
    }
}
