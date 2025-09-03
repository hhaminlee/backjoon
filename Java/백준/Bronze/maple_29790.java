package org.example;

import java.util.Scanner;

public class maple_29790 {
    public static void main(String[] args) {
        int n,u,l,count=0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        u = s.nextInt();
        l = s.nextInt();
        if(n>=1000)
            count++;
        if(u>=8000||l>=260)
            count+=2;

        if(count==1)
            System.out.println("Good");
        else if(count>2)
            System.out.println("Very Good");
        else
            System.out.println("Bad");
    }
}
