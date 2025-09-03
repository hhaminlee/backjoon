package org.example;


import java.util.*;

public class 차집합_1822 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<a; i++){
            set.add(s.nextInt());
        }
        for(int i=0; i<b; i++){
            int c = s.nextInt();
            if(set.contains(c))
                set.remove(c);
        }
        sb.append(set.size()).append("\n");
        for(int ans : set)
            sb.append(ans).append(" ");
        System.out.println(sb);
    }
}
