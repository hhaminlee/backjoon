package org.example;

import java.util.Scanner;

public class 거꾸로덧셈_1357 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        StringBuilder sb = new StringBuilder();

        sb.append(a);
        a = sb.reverse().toString();
        sb.setLength(0);

        sb.append(b);
        b = sb.reverse().toString();

        int ans = Integer.parseInt(a)+Integer.parseInt(b);
        sb.setLength(0);
        String ans1 = Integer.toString(ans);
        sb.append(ans1);
        ans1 = sb.reverse().toString();
        System.out.println(Integer.parseInt(ans1));
    }
}
