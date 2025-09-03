package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 뒤집기_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] aa = str.split("");
        int sum0 = 0, sum1 = 0;
        if(aa[0].equals("1"))
            sum0++;
        else
            sum1++;

        for(int i=1; i<str.length(); i++){
            if(aa[i-1].equals("1")&&aa[i].equals("0"))
                sum1++;
            else if(aa[i-1].equals("0")&&aa[i].equals("1"))
                sum0++;
        }
        System.out.println(Math.min(sum1,sum0));
    }
}
