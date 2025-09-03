package org.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class router_15828 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Queue<Integer> q = new LinkedList<>();
        while(true){
            int a = s.nextInt();
            if(a==-1)
                break;
            else if(a!=0&&q.size()<n){
                q.add(a);
            }
            else if(a==0)
                q.poll();
        }
        if(q.isEmpty())
            System.out.println("Empty");
        else{
            Iterator iter =q.iterator();
            while (iter.hasNext())
                System.out.print(iter.next()+" ");
        }
    }
}
