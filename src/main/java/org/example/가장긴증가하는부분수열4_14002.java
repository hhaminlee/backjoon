package org.example;

import java.util.Scanner;
import java.util.Stack;

public class 가장긴증가하는부분수열4_14002 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            dp[i] = 1;
        }
        int max = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        Stack<Integer> st = new Stack<>();
        int temp = max;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=0; j--) {
                if (dp[j] == temp) {
                    st.push(arr[j]);
                    temp--;
                }
            }
            if (temp == 1)
                st.push(arr[i]);
        }
        System.out.println(max);
        for(int i=0; i<max; i++){
            System.out.print(st.peek()+" ");
            st.pop();
        }
    }
}
