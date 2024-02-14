package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class 수찾기_1920 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        int m = s.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = s.nextInt();
        }
        for(int i=0; i<m; i++){
            System.out.println((binary_search(a, b[i], 0, n-1)));
        }
    }
    public static int binary_search(int[] array, int target, int start, int end){
        if(start>end)
            return 0;
        int mid =((start+end) / 2);
        //System.out.print("mid: "+mid+" "+"array: "+array[mid]+" ");
        if(array[mid]==target)
            return 1;
        else if(array[mid]>target)
            return binary_search(array, target, start, mid-1);
        else
            return binary_search(array, target, mid+1, end);

    }
}
