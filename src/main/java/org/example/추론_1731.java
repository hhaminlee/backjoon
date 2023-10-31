package org.example;

import java.util.Scanner;

public class 추론_1731 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] aa = new int[n+1];
        for(int i=0; i<n; i++){
            aa[i] = s.nextInt();
        }
        if(aa[1]%aa[0]==0&&aa[2]%aa[1]==0)
            System.out.println(aa[n-1]*(aa[1]/aa[0]));
        else
            System.out.println(aa[n-1]+(aa[1]-aa[0]));
    }
}
