package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 단어정렬_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String aa = br.readLine();
            if(!list.contains(aa))
                list.add(aa);
        }
        Collections.sort(list);
        Collections.sort(list, (String a, String b) -> a.length() - b.length());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
