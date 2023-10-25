package org.example;

import java.util.Scanner;

public class ball_1547 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ball = new int[4];
        ball[1] = 1;

        for(int i=0; i<n; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int temp = ball[a];
            ball[a] = ball[b];
            ball[b] = temp;
        }
        for(int i=1; i<=3; i++){
            if(ball[i]==1)
                System.out.println(i);
        }
    }
}
