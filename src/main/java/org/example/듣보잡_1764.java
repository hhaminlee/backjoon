package org.example;

import java.util.*;

public class 듣보잡_1764 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TreeMap<String, Integer> map = new TreeMap<>();
        int n = s.nextInt();
        int m = s.nextInt();
        for(int i=0; i<n; i++){
            map.put(s.next(),1);
        }
        int count=0;
        String b = "";
        for(int i=0; i<m; i++){
            String a = s.next();
            if(map.containsKey(a)){
                b=a+" "+b+" ";
                count++;
            }
        }
        String[] aa = b.split(" ");
        Arrays.sort(aa);
        System.out.println(count);
        for(int i=0; i<count; i++){
            System.out.println(aa[i]);
        }
    }
}
