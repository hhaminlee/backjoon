package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class 세수정렬_2752 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0; i<3; i++){
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        for (int i=0; i<3; i++){
            System.out.print(a[i]+" ");
        }
    }
}
