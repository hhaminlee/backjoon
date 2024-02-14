package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class 인사성밝은곰곰이_25192 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        HashSet<String> set = new HashSet<>();
        int count=0;
        for(int i=0; i<n; i++){
            String a = s.nextLine();
            if(a.equals("ENTER")){
                set.clear();
            }
            else {
                if(!set.contains(a))
                    count++;
                set.add(a);
            }
        }
        System.out.println(count);
    }
}
