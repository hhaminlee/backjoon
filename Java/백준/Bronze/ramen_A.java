package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ramen_A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a,b,x;
        for(int i=0; i<n; i++){
            a=s.nextInt();
            b=s.nextInt();
            x=s.nextInt();
            System.out.println((x-1)*a+b);
        }
    }
}
