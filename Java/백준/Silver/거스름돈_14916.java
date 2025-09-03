package org.example;

import java.util.Scanner;

public class 거스름돈_14916 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum =0;
        boolean flag = true;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i*5+j*2==n){
                    sum=i+j;
                    flag = false;
                    break;
                }
            }
        }
        if(flag)
            System.out.println("-1");
        else
            System.out.println(sum);
    }
}
