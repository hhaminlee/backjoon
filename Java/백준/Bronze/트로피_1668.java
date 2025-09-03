package org.example;

import java.util.Scanner;

public class 트로피_1668 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = 0;
        int r = 0, l = 0;
        int[] arr = new int[n+1];
        for(int i=0; i<n; i++){
            int t = s.nextInt();
            arr[i] = t;
            if(t>max){
                max = t;
                r++;
            }
        }
        max = 0;
        for(int i=n; i>=0; i--){
            if(arr[i]>max){
                max = arr[i];
                l++;
            }
        }
        System.out.println(r +"\n" + l);
    }
}
