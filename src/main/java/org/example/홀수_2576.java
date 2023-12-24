package org.example;

import java.util.Scanner;

public class 홀수_2576 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[7];
        int min = 100;
        int sum = 0;
        for(int i=0; i<7; i++){
            a[i] = s.nextInt();
            if(a[i]%2!=0){
                min = Math.min(a[i],min);
                sum+=a[i];
            }
        }
        if(min!=100){
            System.out.println(sum+"\n"+min);
        }
        else
            System.out.println("-1");
    }
}
