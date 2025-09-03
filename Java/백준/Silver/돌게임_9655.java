package org.example;

import java.util.Scanner;

public class 돌게임_9655 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2==0)
            System.out.println("CY");
        else
            System.out.println("SK");
    }
}
