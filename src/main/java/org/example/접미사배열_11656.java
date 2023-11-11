package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class 접미사배열_11656 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String aa = s.nextLine();
        String[] ans = new String[aa.length()+1];
        for(int i=0; i<=aa.length(); i++){
            ans[i] = aa.substring(i);
        }
        Arrays.sort(ans);
        for(int i=1; i<=aa.length(); i++){
            System.out.println(ans[i]);
        }
    }
}
