package org.example;

import java.util.*;

public class 정렬_10814 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            map.put(s.nextInt(), s.next());
    }
        List<Map.Entry<Integer, String >> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(((o1, o2) -> o1.getKey() - o2.getKey()));
        for(Map.Entry<Integer, String> entry : entryList){
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
        }
    }
}
