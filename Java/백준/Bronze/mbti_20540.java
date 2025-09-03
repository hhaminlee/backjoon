package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mbti_20540 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mb = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<4; i++){
            char ti = mb.charAt(i);
            if(ti=='E')
                sb.append("I");
            else if(ti=='I')
                sb.append("E");
            else if(ti=='S')
                sb.append("N");
            else if(ti=='N')
                sb.append("S");
            else if(ti=='T')
                sb.append("F");
            else if(ti=='F')
                sb.append("T");
            else if(ti=='J')
                sb.append("P");
            else if(ti=='P')
                sb.append("J");
        }
        System.out.println(sb);
    }
}
