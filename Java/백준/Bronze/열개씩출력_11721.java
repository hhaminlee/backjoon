package org.example;

import java.util.Scanner;

public class 열개씩출력_11721 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String aa = s.nextLine();
        String[] ans = aa.split("");
        for(int i=0; i<aa.length(); i++){
            System.out.print(ans[i]);
            if(i%10==9)
                System.out.println();
        }
    }

}
