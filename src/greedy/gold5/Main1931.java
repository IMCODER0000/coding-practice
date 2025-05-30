package greedy.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1931 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] Is = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            Is[i][0] = a;
            Is[i][1] = b;

        }


        Arrays.sort(Is, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });
        int count = 1;
        int startTime = Is[0][1];
        for (int i = 1; i < N; i++) {
            if(Is[i][0]>=startTime){
                count++;
                startTime = Is[i][1];
            }
        }


        System.out.println(count);




    }

}
