package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class k번째수_11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b = br.readLine();
        String[] bb = b.split(" ");
        int n = Integer.parseInt(bb[0]);
        int m = Integer.parseInt(bb[1]);
        String ans = br.readLine();
        String[] aa = ans.split(" ");
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(aa[i]);
        }
        Arrays.sort(a);
        System.out.println(a[m-1]);
    }
}
