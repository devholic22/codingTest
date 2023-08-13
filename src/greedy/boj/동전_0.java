package greedy.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 동전_0 {

    private static BufferedReader br;
    private static BufferedWriter bw;
    private static StringTokenizer st;
    private static Integer[] coins;

    public static void main(String[] args) throws IOException {
        init();

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        settingArray(N);
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(coins, Collections.reverseOrder());

        int count = 0;
        for (int coin : coins) {
            while (K >= coin) {
                 K -= coin;
                count++;
            }
        }

        bw.write(count + "");
        bw.close();
        br.close();
    }

    private static void init() {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    private static void settingArray(int number) {
        coins = new Integer[number];
    }
}
