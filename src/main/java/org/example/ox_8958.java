package org.example;

import java.util.Scanner;

public class ox_8958 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        for(int i=0; i<t; i++){
            int cnt=0;
            int answer=0;

            String ox = s.nextLine();
            for(int j=0; j<ox.length(); j++){
                char ans = ox.charAt(j);
                if(ans=='O'){
                    cnt++;
                    answer+=cnt;
                }
                else if(ans=='X'){
                    cnt=0;
                }
            }
            System.out.println(answer);
        }
    }
}
