package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 반전요세푸스_20301 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int m = s.nextInt();
        boolean aa = true;
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=1; i<=n; i++){
            deque.add(i);
        }
        for(int i=1; i<=n; i++){

            if(aa){
                for(int j=1; j<k; j++){
                    deque.add(deque.poll());
                }
                System.out.println(deque.poll());
            }
            else{
                for(int j=1; j<k; j++){
                    deque.addFirst(deque.pollLast());
                }
                System.out.println(deque.pollLast());
            }
            if(i%m==0)
                aa=!aa;
        }
    }
}
