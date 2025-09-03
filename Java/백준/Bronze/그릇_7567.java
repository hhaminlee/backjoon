package org.example;

import java.util.Scanner;

public class 그릇_7567 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String[] aa = a.split("");
        int sum=10;
        for(int i=1; i<a.length(); i++){
            if(aa[i].equals("(")){
                if(aa[i-1].equals(")"))
                    sum+=10;
                else
                    sum+=5;
            }
            else if(aa[i].equals(")")){
                if(aa[i-1].equals(")"))
                    sum+=5;
                else
                    sum+=10;
            }
        }
        System.out.println(sum);
    }
}
