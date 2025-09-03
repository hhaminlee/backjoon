package org.example;

import java.util.Scanner;

public class 백대열_14490 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String aa = s.nextLine();
        String[] ans = aa.split(":");
        int n = Integer.parseInt(ans[0]);
        int m = Integer.parseInt(ans[1]);
        int max = 0;
        for(int i=1; i<Math.max(n,m); i++){
            if((n%i==0 && m%i==0) && max<i)
                max = i;
        }
        System.out.println(n/max +":" + m/max);
    }
}
