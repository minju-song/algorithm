package algorithm.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 물건 갯수
        int N = Integer.parseInt(st.nextToken());
        // 최대 용량
        int K = Integer.parseInt(st.nextToken());

        // 무게 배열
        int[] w = new int[N + 1];
        // 가치 배열
        int[] v = new int[N + 1];
        w[0] = 0; v[0] = 0;

        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        // 물건 갯수, 무게
        int[][] dp = new int[N + 1][K + 1];

        // 물건을 안담았을 때의 가치는 0
        for(int i = 0; i <= K; i++) {
            dp[0][i] = 0;
        }

        // i는 물건 갯수
        for(int i = 1; i <= N; i++) {
            for(int j = 0; j <= K; j++) {
                if(j < w[i]) dp[i][j] = dp[i-1][j];
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - w[i]] + v[i]);
                }
            }
        }

        System.out.println(Arrays.stream(dp[N]).max().orElse(0));

    }

}
