package org.example;

import java.util.Scanner;

public class fibo_1003 {
    //0일때는 0만 1
    //1일때는 1만 1
    //2일때는 0+1인 1 1
    //3일때 2와 1일때를 합한것과 같음
    //4일때는 3일때와 2일때를 합함
    //5일때는 4일때와 3일때를 합함
    //2차원 배열을 선언해서 0과 1일때를 넣고 다음것들은 그것들을 더해서 구하기
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[][]arr = new int[2][41];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][1] = 1;
        arr[1][0] = 0;
        for (int i=0; i<t; i++){
            int aa = s.nextInt();
            for(int j=2; j<=aa; j++){
                arr[0][j] = arr[0][j-1] + arr[0][j-2];
                arr[1][j] = arr[1][j-1] + arr[1][j-2];
            }
            System.out.print(arr[0][aa] +" ");
            System.out.println(arr[1][aa]);
        }

    }
}
