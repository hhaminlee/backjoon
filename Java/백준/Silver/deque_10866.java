package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class deque_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<String> deque = new LinkedList<>();
        for(int i=0; i<n; i++){
            String str = br.readLine();
            String[] aa = str.split(" ");
            switch (aa[0]) {
                case "push_front" -> deque.addFirst(aa[1]);
                case "push_back" -> deque.addLast(aa[1]);
                case "pop_front" -> {
                    if (deque.isEmpty())
                        System.out.println("-1");
                    else {
                        System.out.println(deque.pollFirst());
                    }
                }
                case "pop_back" -> {
                    if (deque.isEmpty())
                        System.out.println("-1");
                    else {
                        System.out.println(deque.pollLast());
                    }
                }
                case "size" -> System.out.println(deque.size());
                case "empty" -> {
                    if (deque.isEmpty())
                        System.out.println("1");
                    else
                        System.out.println("0");
                }
                case "front" -> {
                    if (deque.isEmpty())
                        System.out.println("-1");
                    else
                        System.out.println(deque.peek());
                }
                case "back" -> {
                    if (deque.isEmpty())
                        System.out.println("-1");
                    else
                        System.out.println(deque.peekLast());
                }
            }
        }
    }
}
