package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class 골드바흐_9020 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[] isPrime = new boolean[10001];
        // 소수는 true
        Arrays.fill(isPrime , true);

        // 0, 1은 소수가 아니므로 false
        isPrime [0] = isPrime [1] = false;

        for(int i=2; i*i<=10000; i++){
            if(isPrime[i]){
                // i 의 배수들도 소수가 아니므로 false 로 만든다.
                for(int j=i*i; j<=10000; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        //두개의 소수의 차이가 가장 작을 때 출력
        int max = 0;
        for(int i=0; i<n; i++){
            max = 0;
            int aa = s.nextInt();
            for(int j=aa/2; j<aa; j++){
                if(isPrime[j]){
                    max = j;
                    if(isPrime[aa-max]){
                        System.out.println(aa-max +" "+ max);
                        break;
                    }
                }
            }
        }
    }
}
