package org.example;

import java.util.Scanner;

public class 지능형기차_2455 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] aa = new int[4];
        int max = 0;
        int c = 0;
        for(int i=0; i<4; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            c += b-a;
            aa[i] += c;
        }
        for(int i=1; i<4; i++){
            if(aa[i-1]<aa[i])
                max = aa[i];
        }
        System.out.println(max);
    }
}
