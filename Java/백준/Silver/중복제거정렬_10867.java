package org.example;

import java.util.Scanner;
import java.util.Stack;

public class 중복제거정렬_10867 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            int a = s.nextInt();
            if(!stack.contains(a))
                stack.push(a);
        }
        stack.sort(null);
        for(Integer st : stack){
            System.out.print(st + " ");
        }
    }
}
