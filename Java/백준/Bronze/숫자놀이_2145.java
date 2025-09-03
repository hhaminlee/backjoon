package org.example;

import java.util.Scanner;

public class 숫자놀이_2145 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            String aa = s.nextLine();
            int sum = 0;
            if(aa.equals("0"))
                break;
            else{
                String[] ans = aa.split("");
                for(int i=0; i<aa.length(); i++){
                    sum+=Integer.parseInt(ans[i]);
                }
                System.out.println(sum);
            }
        }
    }
}
