package org.example;

import java.util.Scanner;

public class big_4101 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true){
            int a = s.nextInt();
            int b = s.nextInt();
            if(a==b && a==0)
                break;
            if(a>b)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
