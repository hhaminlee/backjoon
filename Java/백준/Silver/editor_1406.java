package org.example;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class editor_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String edit = br.readLine();
        LinkedList<Character> list = new LinkedList<Character>();
        for(int i=0; i<edit.length(); i++){
            list.add(edit.charAt(i));
        }
        ListIterator<Character> iter = list.listIterator();
        while(iter.hasNext())
            iter.next();

        int m = Integer.parseInt(br.readLine());
        for(int i=0; i<m; i++){
            String mov = br.readLine();
            char flag = mov.charAt(0);
            if(flag == 'P'){
                iter.add(mov.charAt(2));
            }
            else if(flag == 'L'){
                if(iter.hasPrevious())
                    iter.previous();
            }
            else if(flag == 'D'){
                if(iter.hasNext())
                    iter.next();
            }
            else if(flag == 'B'){
                if(iter.hasPrevious()){
                    iter.previous();
                    iter.remove();
                }
            }
        }
        for(Character ans : list){
            bw.write(ans);
        }
        bw.flush();
        bw.close();
    }
}
