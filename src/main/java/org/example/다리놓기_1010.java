package org.example;

import java.util.Scanner;

public class 다리놓기_1010 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,cnt;
        long sum1=1,sum2=1;
        cnt = s.nextInt();
        for(int i=0; i<cnt; i++) {
            a = s.nextInt();
            b = s.nextInt();
            sum1 =1;
            sum2 =1;
            for(int j=1; j<=b-a; j++){
                sum1*=j;
            }
            for(int k=1; k<=b; k++){
                sum2*=k;
            }
            System.out.println(sum2/sum1);
        }
        s.close();
    }
}
