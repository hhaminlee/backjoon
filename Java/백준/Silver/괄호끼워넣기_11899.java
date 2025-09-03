package org.example;

import java.util.Scanner;
import java.util.Stack;

public class 괄호끼워넣기_11899 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String[] aa = a.split("");
        Stack<String> st = new Stack<>();
        st.push(aa[0]);
        for(int i=1; i<a.length(); i++){
            if(aa[i].equals("(")){
                st.push(aa[i]);
            }
            else if(aa[i].equals(")")){
                if(!st.isEmpty()&&st.peek().equals("("))
                    st.pop();
                else
                    st.push(aa[i]);
            }
        }
        System.out.println(st.size());
    }
}
