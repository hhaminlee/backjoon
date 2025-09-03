package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class stack_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());


        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();
            StringBuilder sb = new StringBuilder();
            switch (order) {
                case "push": {
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                }
                break;
                case "pop": {
                    if (stack.empty())
                        sb.append("-1").append("\n");
                    else{
                        sb.append(stack.peek()).append("\n");
                        stack.pop();
                    }

                }
                break;
                case "size": sb.append(stack.size()).append("\n");
                break;
                case "empty" :{
                    if (stack.empty())
                        sb.append("1").append("\n");
                    else
                        sb.append("0").append("\n");
                }
                break;
                case "top": {
                    if (stack.empty())
                        sb.append("-1").append("\n");
                    else
                        sb.append(stack.peek()).append("\n");
                }
                break;
            }
            System.out.print(sb);
        }
    }
}
