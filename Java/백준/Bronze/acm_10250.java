package org.example;

import java.util.Scanner;

public class acm_10250 {
    public static void main(String[] args) {
        //101~ 10h
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0; i<t; i++){
            int h = s.nextInt();
            int w = s.nextInt();
            int n = s.nextInt();
            //앞자리는 h만큼까지 증가해야함
            //뒷자리는 w까지 증가해야함
            if(n%h==0)
                System.out.println(h*100+n/h);//n이 h로 나눠지므로
            else
                System.out.println(n%h*100+(n/h+1));//n이 h로 안나눠지므로 +1
        }

    }
}
