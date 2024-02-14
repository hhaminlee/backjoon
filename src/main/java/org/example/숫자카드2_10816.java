package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class 숫자카드2_10816 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            //아직까지 입력받지 않은 수일 경우 입력받은 수와 1을 넣어줌
            if(map.get(a[i])==null)
                map.put(a[i],1);
            //입력받은 수일 경우 1을 더해줌
            else
                map.put(a[i], map.get(a[i])+1);
        }
        int m = s.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
            if(map.get(b[i])==null)
                sb.append(0).append(" ");
            else
                sb.append(map.get(b[i])).append(" ");
        }
        System.out.println(sb);
    }
}
