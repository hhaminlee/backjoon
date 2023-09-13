package org.example;

import java.util.*;
//같은 이름이 나오면 map에 넣지 않는 방법
public class company_7785 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String name,el;
        for(int i=0; i<n; i++){
            name = s.next();
            el = s.next();
            if(map.containsKey(name))
                map.remove(name);
            else
                map.put(name,el);
        }
        ArrayList<String> remain = new ArrayList<String>(map.keySet());
        Collections.sort(remain, Collections.reverseOrder());

        for(var li : remain) {
            System.out.println(li);
        }
    }
}
