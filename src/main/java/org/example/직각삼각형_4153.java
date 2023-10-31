package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class 직각삼각형_4153 {
    public static void main(String[] args) {
        int[] tri = new int[3];
        Scanner s = new Scanner(System.in);
        while(true){
            tri[0] = s.nextInt();
            tri[1] = s.nextInt();
            tri[2] = s.nextInt();
            if(tri[0]==0&&(tri[1]==0&&tri[2]==0))
                break;
            Arrays.sort(tri);
            if(tri[0]*tri[0]+tri[1]*tri[1]==tri[2]*tri[2])
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}
