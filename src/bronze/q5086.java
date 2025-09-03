package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q5086 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = reader.readLine();
            String[] strArr = str.split(" ");
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);

            if(a < b && b % a == 0) {
                System.out.println("factor");
            }
            else if (a > b && a % b == 0) {
                System.out.println("multiple");
            }
            else if (a == 0 && b == 0) break;
            else {
                System.out.println("neither");
            }
        }
    }
}
