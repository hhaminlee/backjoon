package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class sosu_1929 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        boolean[] isPrime = new boolean[1000001];
        // 소수는 true
        Arrays.fill(isPrime , true);

        // 0, 1은 소수가 아니므로 false
        isPrime [0] = isPrime [1] = false;

        for(int i=2; i*i<=1000000; i++){
            if(isPrime[i]){
                // i 의 배수들도 소수가 아니므로 false 로 만든다.
                for(int j=i*i; j<=1000000; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i=m; i<=n; i++){
            if(isPrime[i])
                System.out.println(i);
        }
    }
}
