package bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class q2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= Math.sqrt(N); i++) {
            if(N % i == 0) {
                list.add(i);
                if(i != N / i) {
                    list.add(N / i);
                }
            }
        }

        Collections.sort(list);

        if(K > list.size()) {
            System.out.println(0);
        }
        else {
            System.out.println(list.get(K - 1));
        }
    }
}
