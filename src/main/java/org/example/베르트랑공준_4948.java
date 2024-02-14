package org.example;

import java.util.Scanner;

public class 베르트랑공준_4948 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] isPrime = new int[300001];
        isPrime[0] = isPrime[1] = 0;
        for(int i=2; i<=300000; i++){
            isPrime[i] = i;
        }
        for(int i=2; i<=300000; i++){
            if(isPrime[i]==0)
                continue;
            for (int j = 2 * i; j <= 300000; j += i) {
                isPrime[j] = 0;
            }
        }
        while(true){
            int n = s.nextInt();
            int sum = 0;
            if(n==0)
                break;
            for(int i=n+1; i<=2*n; i++){
                if(isPrime[i]!=0)
                    sum++;
            }
            System.out.println(sum);
        }
    }
}
