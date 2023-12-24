package org.example;

import java.util.Scanner;

public class 상근날드_5543 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] burger = new int[3];
        int coke, cider;
        for(int i=0; i<3; i++){
            burger[i] = s.nextInt();
        }
        coke = s.nextInt();
        cider = s.nextInt();
        int min = 2200;
        for(int i=0; i<3; i++){
            burger[i] = Math.min(burger[i]+coke,burger[i]+cider);
            if(burger[i]<min)
                min = burger[i];
        }
        System.out.println(min-50);
    }
}
