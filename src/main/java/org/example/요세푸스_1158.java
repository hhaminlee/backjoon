package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스_1158 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = s.nextInt();
        int k = s.nextInt();
        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        System.out.print("<");
        for(int i=1; i<=n; i++){
            for(int j=1; j<k; j++){
                queue.add(queue.poll());
            }
            if(queue.size()==1)
                System.out.print(queue.poll()+">");
            else
                System.out.print(queue.poll()+", " );
        }
    }
}
