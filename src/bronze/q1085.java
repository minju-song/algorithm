package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class q1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int[] arr = {x, w - x, y, h - y};

        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println(min);
    }
}
