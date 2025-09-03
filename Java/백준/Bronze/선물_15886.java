package org.example;

import java.util.Scanner;

public class 선물_15886 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String aa = s.nextLine();
        String[] ans = aa.split("");
        int sum = 0;
        for(int i=1; i<aa.length(); i++){
            if(ans[i-1].equals("E") && ans[i].equals("W"))
                sum++;
        }
        System.out.println(sum);
    }

}
