package org.example;

import java.util.Scanner;

public class 팰린드롬수_1259 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            String aa = s.nextLine();
            if(aa.equals("0"))
                break;
            String bb = sb.append(aa).reverse().toString();
            if(aa.equals(bb))
                System.out.println("yes");
            else
                System.out.println("no");
            sb.setLength(0);
        }
    }
}
