package org.example;

import java.util.Scanner;

public class 윷놀이_2490 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int i=0; i<3; i++){
            int sum = 0;
            String a = s.nextLine();
            String[] aa = a.split(" ");
            sum+=Integer.parseInt(aa[0])+Integer.parseInt(aa[1])
                    +Integer.parseInt(aa[2])+Integer.parseInt(aa[3]);
            if(sum==0)
                System.out.println("D");
            else if (sum==1)
                System.out.println("C");
            else if (sum==2)
                System.out.println("B");
            else if (sum==3)
                System.out.println("A");
            else if (sum==4)
                System.out.println("E");
        }


    }
}
