package org.example;

import java.util.Scanner;

public class bs_A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int count = 0;
        int a,b,k,x;
        a = s.nextInt();
        b = s.nextInt();
        k = s.nextInt();
        x = s.nextInt();
        if(k+x<a||k-x>b)
            System.out.println("IMPOSSIBLE");
        else {
            for(int i = k-x; i<=k+x; i++){
                if(i>=a&&i<=b)
                    count++;
            }
            System.out.println(count);
        }
    }
}
