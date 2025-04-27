import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int snack = 1,i=0;
        boolean flag = true;
        int[] a = new int[n+1];
        for(i=0; i<n; i++){
            a[i] = s.nextInt();
        }
        i=0;
        while (i!=n){
            if(!stack2.isEmpty()&&stack2.peek()==snack){
                stack1.push(stack2.pop());
                snack++;
            }
            else if(a[i]>snack){
                stack2.push(a[i]);
                i++;
            }
            if(a[i]==snack){
                stack1.push(a[i]);
                snack++;
                i++;
            }
        }
        if(stack2.size()>=2){
            for(i=0; i<stack2.size(); i++){
                int aa = stack2.peek();
                stack2.pop();
                int bb = stack2.peek();
                if(aa>bb){
                    flag = false;
                    break;
                }

            }
        }
        if(flag)
            System.out.println("Nice");
        else
            System.out.println("Sad");
    }
}
