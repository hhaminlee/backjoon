package org.example;

import java.util.Scanner;

public class 대소문자변경_2744 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String[] aa = a.split("");
        for(int i=0; i<a.length(); i++){
            if(aa[i].charAt(0)<='z'&&aa[i].charAt(0)>='a')
                aa[i] = aa[i].toUpperCase();
            else
                aa[i] = aa[i].toLowerCase();
        }
        for(int i=0; i<a.length(); i++)
            System.out.print(aa[i]);
    }
}
