import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count=0,cnt=0;
        for(int i=666; i<=10000000; i++){
            int temp = i;
            cnt = 0;
            while(temp!=0){
                if(temp%10==6)
                    cnt++;
                else
                    cnt=0;
                if(cnt==3){
                    count++;
                    cnt=0;
                    break;
                }
                temp/=10;
            }
            if(count==n){
                System.out.println(i);
                break;
            }
        }
    }
}
