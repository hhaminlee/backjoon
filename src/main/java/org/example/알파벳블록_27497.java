package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class 알파벳블록_27497 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Boolean> stack = new Stack<>();
        Deque<String> deque = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "1":
                    deque.addLast(st.nextToken());
                    stack.push(false);
                    break;
                case "2":
                    deque.addFirst(st.nextToken());
                    stack.push(true);
                    break;
                case  "3":
                    if(!deque.isEmpty()){
                        if(!stack.peek()){
                            deque.removeLast();
                            stack.pop();
                        }
                        else{
                            deque.removeFirst();
                            stack.pop();
                        }

                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(deque.isEmpty())
            System.out.println("0");
        else{
            for (String elem : deque) {
                sb.append(elem);
            }
        }
        System.out.println(sb);
    }
}
