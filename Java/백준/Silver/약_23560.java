package org.example;

import java.util.Scanner;

public class 약_23560 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = 2;
        for(int i=1; i<n; i++){
            ans *=3;
        }
        System.out.println(ans);
    }
}
