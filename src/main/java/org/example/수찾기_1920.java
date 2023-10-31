package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class 수찾기_1920 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.next();
        String[] a = new String[Integer.parseInt(n)+1];
        boolean flag = true;

        for(int i=1; i<=Integer.parseInt(n); i++){
            a[i] = s.next();
        }

        String m = s.next();
        String[] b = new String[Integer.parseInt(m)+1];

        for(int i=1; i<=Integer.parseInt(m); i++){
            b[i] = s.next();
        }
        for(int i=1; i<=Integer.parseInt(n); i++){
            flag = true;
            flag = Arrays.asList(a).contains(b[i]);
            if(flag)
                System.out.println("1");
            else
                System.out.println("0");
        }

    }
}
