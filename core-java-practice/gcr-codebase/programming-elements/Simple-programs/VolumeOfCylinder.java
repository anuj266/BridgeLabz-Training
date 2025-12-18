// package core-java-practice.gcr-codebase.programming-elements;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float radius = sc.nextFloat();
        Float height = sc.nextFloat();
        Double volume = 3.14*radius*radius*height;
        System.out.println(volume);
    }
}
