package org.example;

import java.util.Scanner;

public class 치킨쿠폰_1673 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(s.hasNextInt()){
            int n = s.nextInt();
            int k = s.nextInt();
            int sum = n;
                while(n/k>0){
                    sum+=n/k;
                    n = n/k + n%k;
                }
            System.out.println(sum);
        }
    }
}
