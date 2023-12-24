package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class k번째수_11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        s.nextLine();
        String ans = s.nextLine();
        String[] aa = ans.split(" ");
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(aa[i]);
        }
        Arrays.sort(a);
        System.out.println(a[m-1]);
    }
}
