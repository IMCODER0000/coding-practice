package greedy.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main11047 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] NK = br.readLine().split(" ");

        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);


        int[] coins = new int[N];
        int count = 0;
        int sum = K;


        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= sum) {
                count += sum/coins[i];
                sum%=coins[i];
            }
        }

        System.out.println(count);




    }


}
