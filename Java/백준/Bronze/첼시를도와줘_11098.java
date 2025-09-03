package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 첼시를도와줘_11098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());
            int max = 0;
            int aaa = 0;
            String maxP="";
            for(int j=0; j<a; j++){
                String b = br.readLine();
                StringTokenizer st = new StringTokenizer(b);
                aaa = Integer.parseInt(st.nextToken());
                if(aaa>max){
                    maxP = st.nextToken();
                    max = aaa;
                }
            }
            sb.append(maxP).append("\n");
        }
        System.out.print(sb);
    }
}
