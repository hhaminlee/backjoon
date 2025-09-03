package org.example;

import javax.swing.*;
import java.util.Scanner;

public class 이상한곱셈_1225 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        String[] aa = a.split("");
        String[] bb = b.split("");
        long ans=0;
        for(int i=0; i<a.length(); i++){
            for(int j=0; j<b.length(); j++){
                ans += Long.parseLong(aa[i])*Long.parseLong(bb[j]);
            }
        }
        System.out.println(ans);
    }
}
