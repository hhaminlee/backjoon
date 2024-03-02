package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 마인크래프트_18111 {
    public static void main(String[] args) throws IOException {
        //가장 낮은 층, 높은 층 사이에서 존재하는 높이를 구함 -> 더 낮거나 더 높으면 최소가 안됨

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] map = new int[a][b];
        int bag = Integer.parseInt(st.nextToken());
        int min=257, max=0;
        for(int i=0; i<a; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<b; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(min>map[i][j])
                    min = map[i][j];
                if(max<map[i][j])
                    max = map[i][j];
            }
        }
        //범위를 정하기 위해서 min, max를 결정함
        int time = 99999999;
        int high = 0;
        for(int i=min; i<=max; i++){
            //범위 안에서 탐색
            int count = 0;
            //시간을 계산하는 변수 설정
            int block = bag;
            //블록수를 계산하는 변수
            for(int j=0; j<a; j++){
                for(int k=0; k<b; k++){
                    if(i<map[j][k]){
                        //만약 현재 위치가 범위로 설정한 갯수보다 많을때
                        count += (map[j][k]-i)*2;
                        //인벤토리에 넣는 과정에서 시간이 2초 소요
                        block += map[j][k]-i;
                        //인벤토리에 블록은 맵에서 블록을 없앤만큼 증가
                    }
                    else{
                        //만약 현재 위치가 범위로 설정한 갯수보다 적을때
                        count += i-map[j][k];
                        //인벤토리에서 꺼내는 1초 소요
                        block -= i-map[j][k];
                        //인벤토리에서 꺼낸 블록수만큼 감소
                    }
                }

                }
                if(block<0)
                    break;
                //만약 중간에 블록수가 마이너스가 된다면 종료
                //적은 수부터 시작(min -> max)이기 때문에
                if(time>=count){
                    time = count;
                    high = i;
            }
        }
        System.out.println(time+" "+ high);

    }
}
