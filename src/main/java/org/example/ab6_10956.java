package org.example;

import java.util.Scanner;

public class ab6_10956 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        for(int i=0; i<n; i++){
            String aa = s.nextLine();
            String[] a = aa.split(",");
            System.out.println(Integer.parseInt(a[0])+Integer.parseInt(a[1]));
        }
    }
}
