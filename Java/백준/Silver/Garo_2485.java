package org.example;

import java.util.Scanner;

public class Garo_2485 {
    static int Euclid(int a, int b){
        if(b==0)
            return a;
        else
            return Euclid(b,a%b);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] tree = new int[100000];
        int[] treeDistance = new int[100000];
        int n = s.nextInt();

        for (int i = 0; i < n; i++)
            tree[i] = s.nextInt();

        for (int i = 0; i < n - 1; i++)
            treeDistance[i] = tree[i + 1] - tree[i];

        int gcd = treeDistance[0];
        int count = 0;

        for (int i = 1; i < n - 1; i++) {
            gcd = Euclid(gcd, treeDistance[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            count += (treeDistance[i] / gcd) - 1;
        }

        System.out.println(count);
    }
}
