package org.example;


import java.util.Scanner;

public class 한수_1065 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aa = s.nextInt();
        int[] ans = new int[6];
        int i=0, count=0;


        for(int j=1; j<=aa; j++){
            if(j<100)
                count++;
            else if(j==1000)
                count=144;
            else{
                ans[0] = j%10;
                ans[1] = j/10%10;
                ans[2] = j/100%10;
                i++;
                if((ans[0]-ans[1])==(ans[1]-ans[2]))
                    count++;
            }
        }
        System.out.println(count);
    }
}
