package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 임스와함께하는미니게임_25757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String a = st.nextToken();
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(br.readLine());
        }
        if(a.equals("Y"))
            System.out.println(set.size());
        else if(a.equals("F"))
            System.out.println(set.size()/2);
        else
            System.out.println(set.size()/3);

    }
}
