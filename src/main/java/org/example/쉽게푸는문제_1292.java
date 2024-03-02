package org.example;

import java.util.Scanner;

public class 쉽게푸는문제_1292 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[2000];
        int a = 0;
        for(int i=0; i<45; i++){
            for(int j=0; j<=i; j++){
                arr[a] = i+1;
                a++;
            }
        }
        int A = s.nextInt();
        int B = s.nextInt();
        int sum = 0;
        for(int i=A-1; i<=B-1; i++)
            sum+=arr[i];
        System.out.println(sum);
    }
}
