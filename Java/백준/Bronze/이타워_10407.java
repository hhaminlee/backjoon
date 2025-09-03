package org.example;

import java.util.Scanner;

public class 이타워_10407 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //1 - 2, 2 - 4, 3 - 16 4 - 65536
        //2 1 1
        String a = s.nextLine();
        if(a.equals("1"))
            System.out.println("2");
        else
            System.out.println("1");
    }
}
