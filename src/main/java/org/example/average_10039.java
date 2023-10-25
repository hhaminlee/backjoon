package org.example;

import java.util.Scanner;

public class average_10039 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum=0;
        for(int i=0; i<5; i++){
            int grade = s.nextInt();
            if(grade<40)
                sum+=40;
            else
                sum+=grade;
        }
        System.out.println(sum/5);
    }
}
