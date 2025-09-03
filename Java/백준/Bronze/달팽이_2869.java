package org.example;

import java.util.Scanner;

public class 달팽이_2869 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int v = s.nextInt();
        double aa = Math.ceil((double) (v - a) /(a-b));
        System.out.println((int)aa+1);
    }
}
