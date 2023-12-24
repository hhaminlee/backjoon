package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class 엄청난부자2_1271 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        BigInteger n = new BigInteger(a);
        BigInteger m = new BigInteger(b);
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}
