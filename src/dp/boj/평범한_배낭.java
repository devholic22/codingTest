package dp.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 평범한_배낭 {

    private static BufferedReader br;
    private static BufferedWriter bw;
    private static StringTokenizer st;
    private static int[][] dp;

    public static void main(String[] args) throws IOException {

        init();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int maxWeight = Integer.parseInt(st.nextToken());

        dp = new int[N + 1][maxWeight + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= maxWeight; j++) {
                if (weight > j) {
                    dp[i][j] = 0;
                    if (dp[i - 1][j] != 0)
                        dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight] + value);
                }
            }
        }

        bw.write(dp[N][maxWeight] + "");
        bw.close();
        br.close();
    }

    public static void init() {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }
}