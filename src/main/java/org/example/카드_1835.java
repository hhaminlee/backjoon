package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 카드_1835 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();
        int n = s.nextInt();
        for(int i=n; i>0; i--){
            dq.addFirst(i);
            //i번째마다 i번 반복해야 하므로
            for(int j=0; j<i; j++){
                dq.addFirst(dq.pollLast());
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(dq.poll()+" ");
        }
    }
}
