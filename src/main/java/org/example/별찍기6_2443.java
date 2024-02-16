package org.example;

import java.util.Scanner;

public class 별찍기6_2443 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=i+1; k<2*n-i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
