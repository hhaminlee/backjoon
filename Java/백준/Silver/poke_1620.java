package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class poke_1620 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        int dogam = s.nextInt();
        int ans = s.nextInt();
        String[] arr = new String[dogam+1];
        for (int i = 1; i <= dogam; i++) {
            arr[i] = s.next();
            map.put(arr[i],i);
        }
        for (int i = 0; i < ans; i++) {
            String poke = s.next();
            if(map.containsKey(poke))
                System.out.println(map.get(poke));
            else
                System.out.println(arr[Integer.parseInt(poke)]);
        }
    }
}
