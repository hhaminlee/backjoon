package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class analyzeword_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        while(true){
            int s=0,l=0,num=0,space=0;
            String n = br.readLine();
            if(count>100)
                break;
            if(n==null)
                break;
            for(int i=0; i<n.length(); i++){
                char c = n.charAt(i);
                if(c>=65 && c<=90)
                    l++;
                else if(c>=97 && c<=122)
                    s++;
                else if(c>=48 && c<=57)
                    num++;
                else if(c==' ')
                    space++;

            }count++;
            System.out.println(s +" "+ l+" " + num+" " + space);
        }
    }
}
