package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
//시간이 오래 걸려서 아직 풀지 못함
public class editor_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String edit = br.readLine();
        LinkedList<Character> list = new LinkedList<Character>();
        for(int i=0; i<edit.length(); i++){
            list.add(edit.charAt(i));
        }
        int m = Integer.parseInt(br.readLine());
        for(int i=0; i<m; i++){
            String mov = br.readLine();
            if(mov.equals("P"));
        }
    }
}
