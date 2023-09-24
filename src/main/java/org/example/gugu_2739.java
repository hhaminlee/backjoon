package org.example;

import java.util.Scanner;

public class gugu_2739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1; i<=9; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
