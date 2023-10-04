package org.example;

import java.util.Scanner;
import java.util.Stack;

public class josepuss_1158 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = s.nextInt();
        int k = s.nextInt();
        for(int i=1; i<=n; i++){
            stack.add(i);
        }
        for(int i=0; i<n; i++){
            if(k>stack.size())
                k=k-stack.size();
            System.out.print(stack.get(k-1)+" ");
            stack.remove(k-1);
            k += k-1;
        }
    }
}
