package org.example;

import java.util.Scanner;

public class 플러그_2010 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += s.nextInt();
        }
        System.out.println(sum-n+1);
    }
}
