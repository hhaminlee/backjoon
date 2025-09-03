package org.example;

import java.util.Scanner;

public class 벌집_2292 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //6*2 - 2, 6*3 - 3 ...
        int one;
        int ans = 1;
        int i=0;
        while(true){
            ans += i*6;
            if(n<=ans){
                one = i+1;
                break;
            }
            i++;
        }
        System.out.println(one);
    }
}
