package org.example;

import java.util.Scanner;

public class 약수_1037 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int max = 0;
        int min = 1000000;
        for(int i=0; i<t; i++){
            int n = s.nextInt();
            if(n>max)
                max = n;
            if(n<min)
                min = n;
        }
        System.out.println(max*min);
    }
}
