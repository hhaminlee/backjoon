package org.example;

import java.util.Scanner;

public class 분산처리_1009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=0; i<n; i++){
            int temp = 1;
            int a = s.nextInt();
            int b = s.nextInt();
            for(int j=1; j<=b; j++){
                temp = temp*a%10;
            }
            if(temp==0)
                System.out.println("10");
            else
                System.out.println(temp);
        }
    }
}
