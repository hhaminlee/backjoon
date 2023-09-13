package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class str_14425 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int count =0;
        for(int i=0; i<=n; i++)
            set.add(s.nextLine());

        for(int i=0; i<m; i++){
            if(set.contains(s.nextLine()))
                count++;
        }
        System.out.println(count);
    }
}
