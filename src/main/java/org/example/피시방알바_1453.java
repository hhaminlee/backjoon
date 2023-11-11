package org.example;

import java.util.Scanner;

public class 피시방알바_1453 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] pc = new int[101];
        int n = s.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            int a = s.nextInt();
            if(pc[a] == 1)
                sum++;
            else
                pc[a] = 1;
        }
        System.out.println(sum);
    }
}
