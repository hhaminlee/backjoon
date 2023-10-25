package org.example;

import java.util.Scanner;
public class 방번호_1475 {
    public static void main(String[] args){
        //같은 번호가 하나 이상 있을때
        //6이나 9가 포함되었을때
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        String[] ans = num.split("");
        int[] arr = new int[10];
        int a,max = 0;
        for(int i=0; i<num.length(); i++) {
            arr[Integer.parseInt(ans[i])]++;
        }
        if((arr[6]+arr[9])%2==0)
            a = (arr[6]+arr[9])/2;
        else
            a = (arr[6]+arr[9])/2+1;
        arr[6] = a;
        arr[9] = a;
        for(int i=0; i<=9; i++){
            if(max<arr[i])
                max = arr[i];
        }
        System.out.println(max);
    }
}
