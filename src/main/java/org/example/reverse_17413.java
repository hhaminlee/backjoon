package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class reverse_17413 {
    //스택에 <>이면 그냥 push
    //아니면 reverse해서 push

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            StringBuilder sb = new StringBuilder(st.nextToken());
            ans.append(sb.reverse()+" ");
        }
        System.out.print(ans);
    }
}
