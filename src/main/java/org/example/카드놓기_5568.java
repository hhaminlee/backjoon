package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class 카드놓기_5568 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        String n = s.nextLine();
        String k = s.nextLine();
        String[] a = new String[Integer.parseInt(n)+1];

        for(int i=0; i<Integer.parseInt(n); i++){
            a[i] = s.nextLine();
        }

        if(k.equals("2")){
            for(int i=0; i<Integer.parseInt(n); i++){
                for(int j=0; j<Integer.parseInt(n); j++){
                    if(i!=j)
                        set.add(a[i]+a[j]);
                }
            }

        }

        else if(k.equals("3")){
            for(int i=0; i<Integer.parseInt(n); i++){
                for(int j=0; j<Integer.parseInt(n); j++){
                    for(int z=0; z<Integer.parseInt(n); z++){
                        if((i!=j&&j!=z)&&z!=i)
                            set.add(a[i]+a[j]+a[z]);
                    }
                }
            }
        }
        else if(k.equals("4")){
            for(int i=0; i<Integer.parseInt(n); i++){
                for(int j=0; j<Integer.parseInt(n); j++){
                    for(int z=0; z<Integer.parseInt(n); z++){
                        for(int h=0; h<Integer.parseInt(n); h++){
                            if(i!=j&&j!=z&&z!=h&&h!=i&&h!=j&&i!=z)
                                set.add(a[i]+a[j]+a[z]+a[h]);
                        }
                    }
                }
            }
        }
        System.out.println(set.size());
    }
}
