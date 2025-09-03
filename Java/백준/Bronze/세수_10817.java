package org.example;

import java.util.Scanner;

public class 세수_10817 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ans = new int[4];
        int max = 0;
        for(int i=0; i<3; i++){
            ans[i] = s.nextInt();
        }
        for(int i : ans){
            max = Math.max(i,max);
        }
        if(max==ans[0])
            System.out.println(Math.max(ans[1],ans[2]));
        else if(max==ans[1])
            System.out.println(Math.max(ans[0],ans[2]));
        else
            System.out.println(Math.max(ans[0],ans[1]));
    }
}
