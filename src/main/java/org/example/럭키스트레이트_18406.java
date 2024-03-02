package org.example;

import java.util.Scanner;

public class 럭키스트레이트_18406 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] aa = a.split("");
        int sum1=0, sum2=0;
        for(int i=0; i<a.length()/2; i++){
            sum1+=Integer.parseInt(aa[i]);
        }
        for(int i=a.length()/2; i<a.length(); i++){
            sum2+=Integer.parseInt(aa[i]);
        }
        if(sum1==sum2)
            System.out.println("LUCKY");
        else
            System.out.println("READY");
    }
}
