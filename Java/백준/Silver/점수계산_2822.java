package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 점수계산_2822 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] aa = new int[8][2];
        int[] bb = new int[5];
        int sum = 0;
        for(int i=0; i<8; i++){
            aa[i][0] = s.nextInt();
            aa[i][1] = i;
        }
        Arrays.sort(aa, Comparator.comparingInt((int[] o) -> o[0]).reversed());
        for(int i=0; i<5; i++){
            bb[i] = aa[i][1];
            sum+=aa[i][0];
        }
        Arrays.sort(bb);
        System.out.println(sum);
        for(int i=0; i<5; i++) {
            System.out.print(bb[i]+1+" ");
        }
     }
}
