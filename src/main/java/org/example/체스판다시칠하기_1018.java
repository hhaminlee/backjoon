package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 체스판다시칠하기_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] aa = a.split(" ");
        String[][] b = new String[Integer.parseInt(aa[0])][Integer.parseInt(aa[1])];
        //행을 기준으로 한줄씩 입력받은 후 배열에 입력하기
        for(int i=0; i<Integer.parseInt(aa[0]); i++){
            a=br.readLine();
            b[i] = a.split("");
        }
        int sum=0, min=3000;
        for(int i=0; i<=Integer.parseInt(aa[0])-8; i++){
            for(int j=0; j<=Integer.parseInt(aa[1])-8; j++){
                //왼쪽 상단이 B로 시작할때
                if(b[i][j].equals("B")){
                    sum=0;
                    for(int k=0; k<8; k++){
                        for(int h=0; h<8; h++){
                            if(k%2==0&&h%2==0){
                                if(b[i+k][j+h].equals("W"))
                                    sum++;
                            }
                            else if(k%2!=0&&h%2==0){
                                if(b[i+k][j+h].equals("B"))
                                    sum++;
                            }
                            else if(k%2==0&&h%2!=0){
                                if(b[i+k][j+h].equals("B"))
                                    sum++;
                            }
                            else if(k%2!=0&&h%2!=0){
                                if(b[i+k][j+h].equals("W"))
                                    sum++;
                            }
                        }
                    }
                    min=Math.min(sum,min);
                    //처음 등장하는 B를 W로 바꾸고 실행
                    sum=0;
                    b[i][j]="W";
                        sum++;
                        for(int k=0; k<8; k++){
                            for(int h=0; h<8; h++){
                                if(k%2==0&&h%2==0){
                                    if(b[i+k][j+h].equals("B"))
                                        sum++;
                                }
                                else if(k%2!=0&&h%2==0){
                                    if(b[i+k][j+h].equals("W"))
                                        sum++;
                                }
                                else if(k%2==0&&h%2!=0){
                                    if(b[i+k][j+h].equals("W"))
                                        sum++;
                                }
                                else if(k%2!=0&&h%2!=0){
                                    if(b[i+k][j+h].equals("B"))
                                        sum++;
                                }
                            }
                        }
                        min=Math.min(sum,min);
                    b[i][j]="B";
                }
                //왼쪽 상단이 W로 시작할때
                if(b[i][j].equals("W")){
                    sum=0;
                    for(int k=0; k<8; k++){
                        for(int h=0; h<8; h++){
                            if(k%2==0&&h%2==0){
                                if(b[i+k][j+h].equals("B"))
                                    sum++;
                            }
                            else if(k%2!=0&&h%2==0){
                                if(b[i+k][j+h].equals("W"))
                                    sum++;
                            }
                            else if(k%2==0&&h%2!=0){
                                if(b[i+k][j+h].equals("W"))
                                    sum++;
                            }
                            else if(k%2!=0&&h%2!=0){
                                if(b[i+k][j+h].equals("B"))
                                    sum++;
                            }
                        }
                    }
                    min=Math.min(sum,min);
                    sum=0;
                    //처음 등장하는 W를 B로 바꾸고 실행
                    b[i][j]="B";
                    sum++;
                    for(int k=0; k<8; k++){
                        for(int h=0; h<8; h++){
                            if(k%2==0&&h%2==0){
                                if(b[i+k][j+h].equals("W"))
                                    sum++;
                            }
                            else if(k%2!=0&&h%2==0){
                                if(b[i+k][j+h].equals("B"))
                                    sum++;
                            }
                            else if(k%2==0&&h%2!=0){
                                if(b[i+k][j+h].equals("B"))
                                    sum++;
                            }
                            else if(k%2!=0&&h%2!=0){
                                if(b[i+k][j+h].equals("W"))
                                    sum++;
                            }
                        }
                    }
                    min=Math.min(sum,min);
                    b[i][j]="W";
                }
            }
        }
        System.out.println(min);
    }
}
