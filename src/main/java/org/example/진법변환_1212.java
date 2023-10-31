package org.example;

import java.util.Scanner;

public class 진법변환_1212 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String eight = s.next();
        String ans = "";
        String[] aa = {"000","001", "010", "011","100", "101", "110", "111"};
        int len = eight.length();
        for(int i=0; i<len; i++){
            int a =  eight.charAt(i)-'0';
            sb.append(aa[a]);
        }
        if(eight.equals("0")) System.out.println(eight);
        else{
            while(sb.charAt(0) == '0')
                sb = new StringBuilder(sb.substring(1));
            System.out.println(sb);
        }
    }
}
