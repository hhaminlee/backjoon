package org.example;

import java.util.Scanner;

public class rot13_11655 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] ans = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            ans[i] = str.charAt(i);
            if((ans[i]>=65&&ans[i]<=77) || (ans[i]>=97&&ans[i]<=109))
                ans[i]+=13;
            else if((ans[i]>77 && ans[i]<=90) || (ans[i]>109 && ans[i]<=122))
                ans[i]-=13;
        }
        for(int i=0; i<str.length(); i++){
            System.out.print(ans[i]);
        }
    }
}
