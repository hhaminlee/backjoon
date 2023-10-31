package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 베스트셀러_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String,Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<n; i++){
            String s = br.readLine();
            map.put(s,map.containsKey(s) ? map.get(s) + 1 : 1);
        }
        List<String> keySet = new ArrayList<>(map.keySet());

        String maxKey = null;
        for (String key : map.keySet()) {
            if ((maxKey == null) || ((map.get(key).compareTo(map.get(maxKey)) >= 0) && (key.compareTo(maxKey) < 0))) {
                maxKey = key;
            }
        }
        System.out.println(maxKey);
    }
}
