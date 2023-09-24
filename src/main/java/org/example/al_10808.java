package org.example;

import java.util.Scanner;

public class al_10808 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[27];
        String alpa = s.nextLine();
        for(int i=0; i<alpa.length(); i++){
            a[alpa.charAt(i)-97]++;
        }
        for(int i=0; i<26; i++){
            System.out.print(a[i] + " ");
        }
    }
}
