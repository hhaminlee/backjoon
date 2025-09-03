package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class gcdsum_9613 {
    // 한줄입력받고 배열에 요소 저장
    // 모든 경우의 수를 계산하고 sum에 저장
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] ans = new int[100];
        int j=0;

        for(int i=0; i<t; i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            while(st.hasMoreTokens())
                ans[j] = Integer.parseInt(st.nextToken());


        }
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
