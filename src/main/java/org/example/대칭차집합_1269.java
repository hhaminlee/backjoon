package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 대칭차집합_1269 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c, count = 0;
        Map<Integer, Integer> map = new HashMap();
        for(int i=0; i<a; i++){
            map.put(s.nextInt(),i);
            count = map.size();
        }
        for(int i=0; i<b; i++){
            c = s.nextInt();
            if(map.containsKey(c))
                count--;
            else
                count++;
        }
        System.out.println(count);
    }
}
