package org.example;

import java.util.Scanner;

public class 네수_10824 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String[] arr = a.split(" ");

        String s1 = arr[0]+arr[1];
        String s2 = arr[2]+arr[3];

        long b = Long.parseLong(s1);
        long c = Long.parseLong(s2);
        System.out.println(b+c);
    }
}
