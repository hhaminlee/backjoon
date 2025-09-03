package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class card1_2164 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            que.add(i+1);
        }
        for(int i=0; i<n-1; i++){
            que.remove();
            que.add(que.poll());
        }
        System.out.println(que.peek());
    }
}
