package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class 큰수ab_10757 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger a = s.nextBigInteger();
        BigInteger b = s.nextBigInteger();
        System.out.println(a.add(b));
    }

}