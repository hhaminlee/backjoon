package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 덱2_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Deque<String> deq = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int aa = Integer.parseInt(st.nextToken());
            switch (aa){
                case 1:
                    deq.addFirst(st.nextToken());
                    break;
                case 2:
                    deq.addLast(st.nextToken());
                    break;
                case 3:
                    if(deq.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deq.pollFirst()).append("\n");
                    break;
                case 4:
                    if(deq.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deq.pollLast()).append("\n");
                    break;
                case 5: sb.append(deq.size()).append("\n");
                    break;
                case 6:
                    if (deq.isEmpty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case 7:
                    if(deq.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deq.peekFirst()).append("\n");
                    break;
                case 8:
                    if(deq.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deq.peekLast()).append("\n");
                    break;
            }

        }System.out.print(sb);
    }
}
