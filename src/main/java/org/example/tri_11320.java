package org.example;

import java.util.Scanner;

public class tri_11320 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        int ans =0;
        for(int i=0; i<t; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            ans = (a*a)/(b*b);
            if(a%b!=0)
                ans+=1;
            System.out.println(ans);
        }

    }
}
