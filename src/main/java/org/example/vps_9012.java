package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
//다른사람코드 참고 많이함
public class vps_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();
        String str;
        int t= Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            boolean aa = true;
            stack.clear();
            str = br.readLine();
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)=='(')
                    stack.push("(");
                else if(stack.empty())
                    aa=false;
                else if(!stack.empty()&&str.charAt(j)==')')
                    stack.pop();
            }
            if(stack.empty()&&aa)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}
