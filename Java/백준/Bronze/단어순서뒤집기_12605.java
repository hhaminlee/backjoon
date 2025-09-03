package org.example;

import java.util.Scanner;
import java.util.Stack;

public class 단어순서뒤집기_12605 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<String> st = new Stack<>();
        int n = s.nextInt();
        s.nextLine();

        for(int i=0; i<n; i++){
            String a = s.nextLine();
            String[] aa = a.split(" ");
            for(int j=0; j<aa.length; j++){
                st.push(aa[j]);
            }
            System.out.print("Case #"+(i+1)+": ");
            while(true){
                if(st.isEmpty())
                    break;
                else {
                    System.out.print(st.pop()+" ");
                }
            }
            System.out.println();
        }
    }
}
