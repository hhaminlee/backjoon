package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐2_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push" -> deque.addFirst(Integer.parseInt(st.nextToken()));
                case "pop" -> {
                    if (deque.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(deque.pollLast()).append("\n");
                }
                case "size" -> sb.append(deque.size()).append("\n");
                case "empty" -> {
                    if (deque.isEmpty())
                        sb.append("1\n");
                    else
                        sb.append("0\n");
                }
                case "front" -> {
                    if (deque.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(deque.peekLast()).append("\n");
                }
                case "back" -> {
                    if (deque.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(deque.peek()).append("\n");
                }
            }
        }System.out.println(sb);
    }
}
