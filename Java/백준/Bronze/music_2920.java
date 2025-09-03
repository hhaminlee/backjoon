package org.example;

import java.util.Scanner;

public class music_2920 {
    public static void main(String[] args) {
        int[] aa = new int[8];
        Scanner s = new Scanner(System.in);
        String ans = "";
        for(int i=0; i<8; i++){
            aa[i]=s.nextInt();
        }
        for(int i=0; i<aa.length-1; i++){
            if(aa[i]==aa[i+1]-1)
                ans = "ascending";
            else if(aa[i]==aa[i+1]+1)
                ans = "descending";
            else{
                ans = "mixed";
                break;
            }
        }
        System.out.println(ans);
    }
}
