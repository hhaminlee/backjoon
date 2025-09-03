package org.example;


import java.util.Scanner;

public class 돌게임6_9660 {
    public static void main(String[] args) {
        //1- 창 - 0
        //2- 상 - 1
        //3- 창 - 0
        //4- 상 - 1
        //5- 상 - 1
        //6- 상 - 1
        //7- 상 - 1
        //8- 창 - 0
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        if(a==1)
            System.out.println("CY");
        else if (a==2)
            System.out.println("SK");
        else if (a==3)
            System.out.println("CY");
        else if(a==4)
            System.out.println("SK");
        else{
            if(a%7==0||a%7==2)
                System.out.println("CY");
            else
                System.out.println("SK");
        }
    }
}
