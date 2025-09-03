package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class 보물_1026 {
    //결과값만 구하면 되니까 a배열을 오름차순
    //b배열을 내림차순으로 해서 곱한 후 값을 구한다.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fun = s.nextInt();
        int[] a = new int[fun];
        Integer[] b = new Integer[fun];
        int sum=0;
        for(int i=0; i<a.length; i++){
            a[i] = s.nextInt();
        }
        for(int i=0; i<a.length; i++){
            b[i] = s.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        for(int i=0; i<a.length; i++){
            sum+=a[i]*b[i];
        }
        System.out.println(sum);
    }
}
