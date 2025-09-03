package org.example;

import java.util.*;

public class 붙임성좋은총총이_26069 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        Set<String> set = new HashSet<>();
        set.add("ChongChong");
        for(int i=0; i<n; i++){
            String a = s.nextLine();
            String[] aa = a.split(" ");
            if(set.contains(aa[0])||set.contains(aa[1])){
                //중복값은 저장이 안되므로 모두 저장 -> 중복되지 않은 하나만 저장
                set.add(aa[0]);
                set.add(aa[1]);
            }
        }
        System.out.println(set.size());
    }
}
