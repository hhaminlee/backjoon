package org.example;

import java.util.Scanner;

public class Koi_2475 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ans=0;
        for(int i=0; i<5; i++){
            int num=s.nextInt();
            ans+=(int)Math.pow(num,2);
        }
        System.out.println(ans%10);
    }
}
