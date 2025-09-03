package org.example;

import java.util.Scanner;

public class 설탕배달_2839 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;
        for(int i=0; i<2000; i++){
            for(int j=0; j<2000; j++){
                //5가 먼저 계산이 될 수 있도록
                if(i*5+j*3==n){
                    sum=i+j;
                    break;
                }
            }
        }
        if(sum==0)
            System.out.println("-1");
        else
            System.out.println(sum);
    }
}
