package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class 통계학_2108 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] num = new int[n];
        int[] many = new int[8002];
        int sum = 0;
        for(int i=0; i<n; i++){
            num[i] = s.nextInt();
            sum+=num[i];
        }
        Arrays.sort(num);
        int ans = 0,cnt=0, min=0;
        for(int i=0; i<n; i++){
            many[num[i]+4000]++;
            if(cnt<many[num[i]+4000]){
                cnt=many[num[i]+4000];
                ans=num[i];
            }
        }
        int temp=0;
        for(int i=0; i<8000; i++){
            if(cnt==many[i]) temp++;
            if(temp>1){
                ans=i-4000;
                break;
            }
        }
        System.out.println(Math.round((double) sum/n)
                +"\n"+num[(int)Math.round((double) n/2)-1]
                +"\n"+(ans)
                +"\n"+(num[n-1]-num[0]));
    }
}
