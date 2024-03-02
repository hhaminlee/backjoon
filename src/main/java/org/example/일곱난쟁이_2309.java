package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이_2309 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] small = new int[9];
        int[] nine = new int[9];
        int sum = 0;
        int fakei=0, fakej=0;
        for(int i=0; i<9; i++){
            nine[i] = s.nextInt();
            sum+=nine[i];
        }
        for(int i=0; i<9; i++){
            for(int j=i+1; j<9; j++){
                if(sum-nine[i]-nine[j] == 100){
                    fakei = i;
                    fakej = j;
                }
            }
        }
        for(int i=0; i<9; i++){
            if(i!=fakei && i!=fakej){
                small[i] = nine[i];
            }
        }
        Arrays.sort(small);
        for(int i=2; i<9; i++){
            System.out.println(small[i]);
        }
    }
}
