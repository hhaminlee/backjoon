package org.example;

import java.util.Scanner;

public class gcdlcm_2609 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1,n2));
        System.out.print(n1*n2/gcd(n1,n2));
    }
    public static int gcd(int num1, int num2){
        if(num1 % num2 ==0){
            return num2;
        }
        return gcd(num2, num1%num2);
    }
}
