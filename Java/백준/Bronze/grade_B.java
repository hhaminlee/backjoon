package org.example;

import java.util.Scanner;

public class grade_B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = s.nextInt();
        int k = s.nextInt();
        int d;
        for(int i=0; i<k; i++){
            int g = s.nextInt();
            d = g*100/n;
            if(d<=4)
                sb.append("1"+" ");
            else if(d<=11)
                sb.append("2"+" ");
            else if(d<=23)
                sb.append("3"+" ");
            else if(d<=40)
                sb.append("4"+" ");
            else if(d<=60)
                sb.append("5"+" ");
            else if(d<=77)
                sb.append("6"+" ");
            else if(d<=89)
                sb.append("7"+" ");
            else if(d<=96)
                sb.append("8"+" ");
            else
                sb.append("9"+" ");
        }
        System.out.println(sb);
    }
}
