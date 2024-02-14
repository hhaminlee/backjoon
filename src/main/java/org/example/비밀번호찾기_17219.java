package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 비밀번호찾기_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String>map = new HashMap<>();
        String t = br.readLine();
        String[] aa = t.split(" ");
        int n = Integer.parseInt(aa[0]);
        int ans = Integer.parseInt(aa[1]);
        for(int i=0; i<n; i++){
            t = br.readLine();
            aa = t.split(" ");
            map.put(aa[0],aa[1]);
        }
        for(int i=0; i<ans; i++){
            t = br.readLine();
            System.out.println(map.get(t));
        }
    }
}
