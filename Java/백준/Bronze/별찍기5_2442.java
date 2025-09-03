package org.example;

import java.util.Scanner;

public class 별찍기5_2442 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String a = "*";
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            System.out.print(a);
            System.out.println();
            a += "**";
        }
    }
}
