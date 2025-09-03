package bronze;

import java.util.Scanner;

public class q2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < num - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
