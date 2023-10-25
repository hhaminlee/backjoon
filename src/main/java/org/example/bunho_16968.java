package org.example;

import java.util.Scanner;

public class bunho_16968 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String bun = s.nextLine();
        int ans = 1;
        String[] dc = bun.split("");
        for(int i=0; i<bun.length(); i++) {
            if (dc[i].equals("d")) {
                if (i == 0)
                    ans *= 10;
                else if (dc[i - 1].equals("d"))
                    ans *= 9;
                else
                    ans *= 10;
            }
            else if (dc[i].equals("c")) {
                if (i == 0)
                    ans *= 26;
                else if (dc[i - 1].equals("c"))
                    ans *= 25;
                else
                    ans *= 26;
            }
        }
        System.out.println(ans);
    }
}
