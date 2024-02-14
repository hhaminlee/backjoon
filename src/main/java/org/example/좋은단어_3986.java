package org.example;

import java.util.Scanner;
import java.util.Stack;

public class 좋은단어_3986 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Stack<Character> stack = new Stack<>();
        int ans=0;
        for(int i=0; i<n; i++){
            String aa = s.next();
            for(int j=0; j<aa.length(); j++){
                if(j==0)
                    stack.push(aa.charAt(j));
                else if((!stack.isEmpty())&&stack.peek().equals(aa.charAt(j))){
                    stack.pop();
                }
                else
                    stack.push(aa.charAt(j));
            }
            if(stack.isEmpty())
                ans++;
            stack.clear();
        }
        System.out.println(ans);
    }
}
