package org.example;

import java.util.Scanner;

public class 문어숫자_1864 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int[] num = new int[8];
        while(true){
            String aa = s.nextLine();
            if(aa.equals("#"))
                break;
            else{
                sum=0;
                String[] oc = aa.split("");
                for(int i=0; i<aa.length(); i++){
                    if(oc[i].equals("-"))
                        num[aa.length()-i] = 0;
                    if(oc[i].equals("\\"))
                        num[aa.length()-i] = 1;
                    if(oc[i].equals("("))
                        num[aa.length()-i] = 2;
                    if(oc[i].equals("@"))
                        num[aa.length()-i] = 3;
                    if(oc[i].equals("?"))
                        num[aa.length()-i] = 4;
                    if(oc[i].equals(">"))
                        num[aa.length()-i] = 5;
                    if(oc[i].equals("&"))
                        num[aa.length()-i] = 6;
                    if(oc[i].equals("%"))
                        num[aa.length()-i] = 7;
                    if(oc[i].equals("/"))
                        num[aa.length()-i] = -1;
                }
                for(int i=1; i<=aa.length(); i++){
                    sum+=num[i]*(int)Math.pow(8,i-1);
                }
                System.out.println(sum);
            }
        }
    }
}
