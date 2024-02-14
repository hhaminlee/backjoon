package org.example;

import java.util.Scanner;

public class 수학은비대면_19532 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c,d,e,f;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        e = s.nextInt();
        f = s.nextInt();
        //배열로 줄이기 가능
        for(int i=-999; i<=999; i++){
            for(int j=-999; j<=999; j++){
                if(a*i+b*j==c&&d*i+e*j==f){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
}
