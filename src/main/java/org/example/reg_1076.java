package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class reg_1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] color = {"black","brown","red","orange","yellow",
                "green","blue","violet","grey","white"};
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        long ans = 1;
        ans*=10*Arrays.asList(color).indexOf(a);
        ans+=Arrays.asList(color).indexOf(b);
        ans*=(long)Math.pow(10,Arrays.asList(color).indexOf(c));
        System.out.println(ans);
    }
}
