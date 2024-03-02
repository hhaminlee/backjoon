package org.example;

import java.util.Scanner;

public class 별찍기13_2523 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        StringBuilder sb = new StringBuilder("*");
        for(int i=1; i<=2*n-1; i++){
            if(i>=n){
                System.out.print(sb);
                sb.deleteCharAt(sb.length()-1);
                System.out.println();
            }
            else{
                System.out.print(sb);
                sb.append("*");
                System.out.println();
            }
        }
    }
}
