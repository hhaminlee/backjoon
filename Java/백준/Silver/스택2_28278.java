package org.example;

import java.util.Scanner;
import java.util.Stack;

public class 스택2_28278 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = s.nextInt();
        s.nextLine();
        for(int i=0; i<n; i++){
            String aa = s.nextLine();
            String[] ans = aa.split(" ");
            switch (ans[0]){
                case "1":
                    stack.push(ans[1]);
                    break;
                case "2":
                    if (stack.isEmpty())
                        sb.append("-1").append("\n");
                    else {
                        sb.append(stack.peek()).append("\n");
                        stack.pop();
                    }
                    break;
                case "3":
                    sb.append(stack.size()).append("\n");
                    break;
                case "4":
                    if (stack.isEmpty())
                        sb.append("1").append("\n");
                    else
                        sb.append("0").append("\n");
                    break;
                case "5":
                    if (stack.isEmpty())
                        sb.append("-1").append("\n");
                    else
                        sb.append(stack.peek()).append("\n");
                    break;
            }
        }System.out.println(sb);
    }
}
