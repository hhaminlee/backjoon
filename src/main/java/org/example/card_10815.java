package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class card_10815 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            set.add(s.nextInt());
        }
        int m = s.nextInt();
        int equal;
        for(int i=0; i<m; i++){
            equal = s.nextInt();
            if(set.contains(equal))
                System.out.print("1"+" ");
            else
                System.out.print("0"+" ");
        }
    }
}
