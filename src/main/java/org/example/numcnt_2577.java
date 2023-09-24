package org.example;

import java.util.Scanner;

public class numcnt_2577 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int[] ans = new int[10];
        String str = a*b*c+"";
        for(int i=0; i<str.length(); i++){
            char aa = str.charAt(i);
            if(aa=='0')
                ans[0]++;
            else if(aa=='1')
                ans[1]++;
            else if(aa=='2')
                ans[2]++;
            else if(aa=='3')
                ans[3]++;
            else if(aa=='4')
                ans[4]++;
            else if(aa=='5')
                ans[5]++;
            else if(aa=='6')
                ans[6]++;
            else if(aa=='7')
                ans[7]++;
            else if(aa=='8')
                ans[8]++;
            else if(aa=='9')
                ans[9]++;
        }
        for(int i=0; i<=9; i++){
            System.out.println(ans[i]);
        }
    }
}
