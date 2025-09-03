package org.example;

import java.util.Scanner;

public class 새_1568 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = n;
        int count = 1;
        for(int i=1; i<=n; i++){
            ans-=count;
            count++;
            if(ans<count){
                count=1;
            }
            if(ans==0){
                System.out.println(i);
                break;
            }

        }
    }
}
