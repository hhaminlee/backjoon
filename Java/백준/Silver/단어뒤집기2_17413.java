package org.example;

import java.util.Scanner;

public class 단어뒤집기2_17413 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        String a = s.nextLine();
        String[] aa = a.split("");
        boolean flag = true;
        for(int i=0; i<a.length(); i++){
            if(aa[i].equals("<")){
                flag = false;
                rev.reverse();
                sb.append(rev);
                sb.append(aa[i]);
                rev.setLength(0);
            }
            else if(aa[i].equals(" ") && flag){
                rev.reverse();
                sb.append(rev);
                sb.append(aa[i]);
                rev.setLength(0);
            }
            else if(aa[i].equals(">")){
                flag = true;
                sb.append(aa[i]);
            }
            else if(!flag)
                sb.append(aa[i]);
            else if(i==a.length()-1){
                rev.append(aa[i]);
                rev.reverse();
                sb.append(rev);
                rev.setLength(0);
            }
            else
                rev.append(aa[i]);

        }
        System.out.println(sb);

    }
}
