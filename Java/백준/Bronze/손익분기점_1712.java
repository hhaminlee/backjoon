package org.example;

import java.util.Scanner;

public class 손익분기점_1712 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(b>=c)
            System.out.println("-1");
        else
            System.out.println(a/(c-b)+1);
    }
}
