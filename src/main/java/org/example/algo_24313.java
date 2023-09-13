package org.example;

import java.util.Scanner;
//풀이를 그대로 사용
public class algo_24313 {
    public static void main(String[] args) {
        int a1,a0,c,n;
        Scanner s = new Scanner(System.in);
        a1 = s.nextInt();
        a0 = s.nextInt();
        c = s.nextInt();
        n = s.nextInt();
        if(a1*n+a0<=c*n && c>=a1)
            System.out.print("1");
        else
            System.out.print("0");
    }
}
