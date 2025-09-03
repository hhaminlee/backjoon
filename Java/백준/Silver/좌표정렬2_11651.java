package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class 좌표정렬2_11651 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] aa = new int[n][2];
        for(int i=0; i<n; i++){
            aa[i][0] = s.nextInt();
            aa[i][1] = s.nextInt();
        }
        Arrays.sort(aa, (o1, o2) -> (o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]));
        for(int i=0; i<n; i++){
            System.out.println(aa[i][0]+" "+aa[i][1]);
        }
    }
}
