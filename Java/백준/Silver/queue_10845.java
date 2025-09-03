package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class queue_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<String> queue = new LinkedList<>();
        for(int i=0; i<n; i++){
            String str = br.readLine();
            String[] aa = str.split(" ");
            if(aa[0].equals("push")){
                queue.add(aa[1]);
            }
            else if(aa[0].equals("pop")){
                if(queue.isEmpty())
                    System.out.println("-1");
                else{
                    System.out.println(queue.peek());
                    queue.poll();
                }
            }
            else if(aa[0].equals("size")){
                System.out.println(queue.size());
            }
            else if(aa[0].equals("empty")){
                if(queue.isEmpty())
                    System.out.println("1");
                else
                    System.out.println("0");
            }
            else if(aa[0].equals("front")){
                if(queue.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(queue.peek());
            }
            else if(aa[0].equals("back")){
                if(queue.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(queue.peekLast());
            }
        }
    }
}
