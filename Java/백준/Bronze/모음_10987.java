package org.example;

import java.util.Scanner;

public class 모음_10987 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String aa = s.nextLine();
        String[] a = aa.split("");
        int cnt = 0;
        for(int i=0; i<aa.length(); i++){
            if(a[i].equals("a"))
                cnt++;
            else if(a[i].equals("e"))
                cnt++;
            else if(a[i].equals("i"))
                cnt++;
            else if(a[i].equals("o"))
                cnt++;
            else if(a[i].equals("u"))
                cnt++;
        }
        System.out.println(cnt);
    }
}
