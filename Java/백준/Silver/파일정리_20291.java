package org.example;

import java.util.*;

public class 파일정리_20291 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int n = s.nextInt();
        s.nextLine();
        for(int i=0; i<n; i++){
            String a = s.nextLine();
            String[] aa = a.split("\\.");
            if(map.containsKey(aa[1]))
                map.put(aa[1],map.get(aa[1])+1);
            else
                map.put(aa[1],1);
        }
        TreeMap<String,Integer> tm = new TreeMap<String,Integer>(map);
        Set<String> keyset = map.keySet();
        Iterator<String> keyiterator = tm.keySet( ).iterator( );
        String k;
        Integer v;

        while(keyiterator.hasNext()) {
            k = (String)keyiterator.next();
            v = tm.get(k);
            System.out.println(k+" "+v);
        }
    }
}
