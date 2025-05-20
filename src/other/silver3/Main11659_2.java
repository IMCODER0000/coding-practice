package other.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main11659_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        String[] NsInput = br.readLine().split(" ");
        int[] Ns = new int[N];
        int[] prefixSum = new int[N + 1];

        for (int i = 0; i < N; i++) {
            Ns[i] = Integer.parseInt(NsInput[i]);
            prefixSum[i + 1] = prefixSum[i] + Ns[i];
        }

        // 5, 9, 12, 14, 15
        // 3- 0 -> 3

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String[] MsInput = br.readLine().split(" ");
            int m1 = Integer.parseInt(MsInput[0]);
            int m2 = Integer.parseInt(MsInput[1]);
            sb.append(prefixSum[m2] - prefixSum[m1 - 1]).append("\n");
        }

        System.out.print(sb);
    }
}