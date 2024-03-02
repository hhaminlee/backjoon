package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 최대힙_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());
            if(a==0){
                if(maxheap.isEmpty())
                    sb.append(0).append("\n");
                else
                    sb.append(maxheap.poll()).append("\n");
            }
            else
                maxheap.add(a);
        }
        System.out.print(sb);
    }
}
