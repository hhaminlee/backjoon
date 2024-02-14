package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class 서로다른부분문자열_11478 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //set에 넣고 마지막에 set size출력
        HashSet<String> h = new HashSet<>();
        String a = s.nextLine();
        String aa ="";
        for(int i=0; i<a.length(); i++){
            for(int j=0; j<a.length(); j++){
                if((i+j)<=a.length())
                    aa = a.substring(i, i+j);
                h.add(aa);
            }
        }
        System.out.println(h.size());
    }
}
