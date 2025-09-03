package org.example;

import java.util.Scanner;

public class book_1434 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int sumbook = 0;
        int sumbox = 0;
        for(int i=0; i<n; i++){
            sumbook += s.nextInt();
        }
        for(int i=0; i<m; i++){
            sumbox += s.nextInt();
        }
        System.out.println(sumbook-sumbox);
    }
}
