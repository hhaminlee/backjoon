package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class 제로_10773 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0; i<n; i++){
            int aa = Integer.parseInt(br.readLine());
            if(aa!=0)
                stack.push(aa);
            else
                stack.pop();
        }
        Iterator<Integer> it = stack.iterator();
        while(it.hasNext())
            sum+=it.next();
        System.out.println(sum);
    }
}
