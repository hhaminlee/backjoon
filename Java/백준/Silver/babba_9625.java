package org.example;

import java.util.Scanner;

public class babba_9625 {
    public static void main(String[] args) {
        // a -> b -> ba -> bab -> babba -> babbabab -> babbababbabba
        //a - 1,0,1,1,2,3,5,
        //b - 0,1,1,2,3,5,8
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n+2];
        int[] b = new int[n+1];
        a[0] = 0;
        b[0] = 1;
        a[1] = 1;
        b[1] = 1;
        for(int i=2; i<=n; i++){
            a[i] = a[i-2]+a[i-1];
        }
        for(int i=2; i<=n; i++){
            b[i] = b[i-2]+b[i-1];
        }
        System.out.println(a[n-1]+" "+b[n-1]);
    }
}
