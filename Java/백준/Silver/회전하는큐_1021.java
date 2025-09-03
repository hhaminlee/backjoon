package org.example;

import java.util.LinkedList;
import java.util.Scanner;

public class 회전하는큐_1021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> deque = new LinkedList<>();
        int countl=0, countr = 0;
        int idx, half;
        int n = s.nextInt();
        for(int i=1; i<=n; i++){
            deque.add(i);
        }
        int m = s.nextInt();
        int[] aa = new int[m+1];
        for(int i=0; i<m; i++){
            aa[i] = s.nextInt();
            while(true){
                //절반값을 half에 저장
                if(deque.size()%2==0)
                    half = deque.size()/2-1;
                else
                    half = deque.size()/2;
                idx = deque.indexOf(aa[i]);
        //입력받은 값의 인덱스를 idx에 저장
                if(deque.peek()==aa[i]){
                    deque.pop();
                    break;
                }
                //만약 인덱스가 절반 보다 앞에 있다면, 앞에 원소를 뒤로
                else if(idx<=half){
                    deque.addLast(deque.pollFirst());
                    countl++;
                }
                //아니라면 뒤의 원소를 앞으로
                else {
                    deque.addFirst(deque.pollLast());
                    countr++;
                }
            }
        }
        System.out.println(countl+countr);
    }
}
