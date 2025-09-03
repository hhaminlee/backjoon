package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드1_2161 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = s.nextInt();
        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        for(int i=1; i<=n; i++){
            System.out.print(queue.poll()+" ");
            queue.add(queue.poll());
        }
    }
}
