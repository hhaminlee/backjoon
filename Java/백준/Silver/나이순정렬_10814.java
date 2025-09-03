package org.example;

import java.util.*;

public class 나이순정렬_10814 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[][] ans = new String[n][2];
        for(int i=0; i<n; i++){
            ans[i][0] = s.next();
            ans[i][1] = s.next();
        }
        //0번 인덱스에 나이, 1번 인덱스에 이름 기입
        Arrays.sort(ans, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                //나이를 기준으로 비교해서 정렬
                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
            }
        });
        for(int i=0; i<n; i++){
            System.out.println(ans[i][0]+" "+ans[i][1]);
        }
    }
}
