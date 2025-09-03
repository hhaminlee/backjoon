package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 타노스_28066 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        while(queue.size()>1){
            if(queue.size()>k){
                queue.add(queue.poll());
                for(int i=0; i<k-1; i++){
                    queue.poll();
                }

            }
            else{
                queue.add(queue.poll());
                while(true){
                    if(queue.size()==1){
                        System.out.println(queue.poll());
                        break;
                    }
                    queue.poll();
                }
            }
        }
    }
}
