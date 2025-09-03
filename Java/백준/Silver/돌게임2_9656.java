package org.example;

import java.util.Scanner;

public class 돌게임2_9656 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2==0)
            System.out.println("SK");
        else
            System.out.println("CY");
    }
}
