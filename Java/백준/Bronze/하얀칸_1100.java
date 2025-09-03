package org.example;

import java.util.Scanner;

public class 하얀칸_1100 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[][] chess = new String[10][10];
        int count = 0;
        for (int i = 0; i < 8; i++) {
            String che = s.next();
            chess[i] = che.split("");
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chess[i][j].equals("F")) {
                    if (i % 2 != 0 && j % 2 != 0)
                        count++;
                    else if (i % 2 == 0 && j % 2 == 0)
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
