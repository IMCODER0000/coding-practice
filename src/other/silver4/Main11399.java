package other.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.server.ExportException;
import java.util.Arrays;

public class Main11399 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int result = 0;

        int N = Integer.parseInt(br.readLine());

        String[] inputS = br.readLine().split(" ");
        int[] input = new int[inputS.length];

        for (int i = 0; i< input.length; i++) {
            input[i] = Integer.parseInt(inputS[i]);
        }

        for(int i = 1; i<input.length; i++) {
            int now = input[i];
            int j = 0;
            for(j = i-1; j>=0 && input[j]>now; j--) {
                input[j+1] = input[j];
            }

            input[j+1] = now;


        }

        for (int i : input) {
            sum +=i;
            result += sum;
        }

        System.out.println(result);






    }
}
