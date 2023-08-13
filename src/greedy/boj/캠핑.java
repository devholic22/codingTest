package greedy.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 캠핑 {
    private static BufferedReader br;
    private static BufferedWriter bw;
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        init();
        int count = 1;
        while (true) {
            settingInput();
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            if (L == 0 && P == 0 && V == 0)
                break;
            int sum = (V / P * L) + Math.min(L, V % P);
            bw.write("Case " + count + ": " + sum + "\n");
            count++;
        }
        bw.close();
        br.close();
    }
    private static void init() {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }
    private static void settingInput() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}
