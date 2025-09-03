package org.example;

import java.util.Scanner;

public class 피자_large_14607 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //1 - 0
        //2 - 1
        //3 - 12 11 3
        //4 - 22 11 11 6
        //5 - 23 11 12 11 10
        //6 - 33 12 11 12 11 15
        //7 - 34 12 11 22 11 11 21
        //8 - 44 22 11 11 22 11 11 28
        //계차수열 일반항이 n(n-1)/2
        long n = s.nextLong();
        System.out.println((n*n-n)/2);
    }
}
