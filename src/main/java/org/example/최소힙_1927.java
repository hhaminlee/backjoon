package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 최소힙_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());
            if(a==0){
                if(minheap.isEmpty())
                    sb.append(0).append("\n");
                else
                    sb.append(minheap.poll()).append("\n");
            }
            else
                minheap.add(a);
        }
        System.out.print(sb);
    }
}
