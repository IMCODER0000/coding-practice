package other.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main11659 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        String[] NsInput = br.readLine().split(" ");
        int[] Ns = new int[N];
        int[] result = new int[M];
        int m1 = 0;
        int m2 = 0;

        for (int i = 0; i < N; i++) {
            Ns[i] = Integer.parseInt(NsInput[i]);
        }

        for (int i = 0; i < M; i++) {
            int sum = 0;
            String[] MsInput = br.readLine().split(" ");
            m1 = Integer.parseInt(MsInput[0]);
            m2 = Integer.parseInt(MsInput[1]);
            for (int j = m1-1; j <= m2-1; j++) {
                sum += Ns[j];
            }
            result[i] = sum;
        }

        for(int i : result){
            System.out.println(i);
        }





    }

}
