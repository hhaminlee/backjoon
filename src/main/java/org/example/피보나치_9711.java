package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 피보나치_9711 {
    //메모리 초과 나지 않게 미리 구간내에 모두 선언해놓기
    //큰 수 이므로 biginteger 사용하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger[] dp = new BigInteger[10001];
        dp[0] = BigInteger.ONE;
        dp[1] = BigInteger.ONE;

        for (int j = 2; j <= 10000; j++) {
            dp[j] = dp[j - 1].add(dp[j - 2]);
        }

        for (int i = 0; i < n; i++) {
            String[] aa = br.readLine().split(" ");
            System.out.println("Case #" + (i + 1) + ": "
                    + dp[Integer.parseInt(aa[0])-1].mod(new BigInteger(aa[1])));
        }

    }
}
