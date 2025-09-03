package org.example;

import java.util.Scanner;
import java.util.Stack;

public class 균형잡힌세상_4949 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        while(true){
            boolean flag = true;
            String a = s.nextLine();
            if(a.equals("."))
                break;
            String[] aa = a.split("");
            for(int i=0; i<aa.length; i++){
                if(aa[i].equals("(")||aa[i].equals("[")){
                    stack.push(aa[i]);
                }
                else if(aa[i].equals(")")){
                    if(stack.isEmpty())
                        flag = false;
                    else if(stack.peek().equals("[")) {
                        flag = false;
                    }
                    else if(stack.peek().equals("(")){
                        stack.pop();
                    }
                }
                else if(aa[i].equals("]")){
                    if(stack.isEmpty())
                        flag = false;
                    else if(stack.peek().equals("(")){
                        flag = false;
                    }
                    else if(stack.peek().equals("["))
                        stack.pop();
                }
            }
            if(!flag)
                System.out.println("no");
            else if(!stack.isEmpty())
                System.out.println("no");
            else
                System.out.println("yes");
            stack.clear();
        }

    }
}
