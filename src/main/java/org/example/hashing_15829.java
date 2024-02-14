package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class hashing_15829 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String a = s.next();
        BigInteger sum = BigInteger.ZERO;
        for(int i=0; i<n; i++){
            sum = sum.add(((BigInteger.valueOf(31).pow(i)).multiply(BigInteger.valueOf(a.charAt(i)-96))).mod(new BigInteger("1234567891")));
            sum=sum.mod(BigInteger.valueOf(1234567891));
        }
        System.out.println(sum);
    }
}
