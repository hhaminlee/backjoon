package org.example;

import java.util.Scanner;

public class 수이어쓰기1_1748 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 1;
        int ans = 0;
        int digit = 10;
        //자리수 계산해서 더해주기
        for(int i=1; i<=n; i++){
            if(i==digit){
                sum++;
                digit*=10;
            }
            ans += sum;
        }
        System.out.println(ans);
    }
}
