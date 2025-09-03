package org.example;

import java.util.Scanner;

public class 링_3036 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int max=n;
        for(int i=0; i<n-1; i++){
            int b = s.nextInt();
            System.out.println(a/gcd(a,b)+"/"+b/gcd(a,b));
        }
    }
    //유클리드 호제법으로 최대공약수 구하기
    public static int gcd(int a, int b){
        int remainder = a%b;
        if(remainder == 0)
            return b;
        return gcd(b,remainder);
    }
}
