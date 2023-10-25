package org.example;

import java.util.Scanner;

public class revgugu_13410 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = s.nextInt();
        int k = s.nextInt();
        int max=0;
        String temp;
        int[] gugu = new int[k+1];
        for(int i=1;i<=k; i++){
            sb.setLength(0);
            gugu[i] = n*i;
            temp = sb.append(gugu[i]).reverse().toString();
            if(Integer.parseInt(temp)>max)
                max = Integer.parseInt(temp);
        }
        System.out.println(max);
    }
}
