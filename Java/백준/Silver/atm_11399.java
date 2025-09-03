package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class atm_11399 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] aa = new int[n];
        int sum = 0;

        for(int i=0; i<n; i++){
            aa[i] = s.nextInt();
        }
        Arrays.sort(aa);

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                sum+=aa[j];
            }
        }
        System.out.println(sum);
    }
}
