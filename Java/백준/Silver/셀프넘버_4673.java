package org.example;

public class 셀프넘버_4673 {
    public static void main(String[] args) {
        boolean[] is_self = new boolean[10002];
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=10000; i++){
            int num = i, j = i;
            while(j>0){
                num+=j%10;
                j/=10;
            }
            if(num<=10000)
                is_self[num] = true;
            if(!is_self[i])
                sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
