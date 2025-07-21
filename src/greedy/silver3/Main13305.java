package greedy.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main13305 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cNum = Integer.parseInt(br.readLine());
        int min = 1000000001;
        long result = 0;


        int[] dis = new int[cNum-1];

        int disSum = 0;
        String[] A = br.readLine().split(" ");
        for (int i = 0; i < cNum-1; i++) {
            dis[i] = Integer.parseInt(A[i]);
            disSum += dis[i];
        }

        int[] cPrice = new int[cNum];
        String[] B = br.readLine().split(" ");
        for (int i = 0; i < cNum; i++) {
            cPrice[i] = Integer.parseInt(B[i]);
            if(i!=cNum-1){
                min = Math.min(min, cPrice[i]);
            }

        }


        int minPrice = cPrice[0];

        for (int i = 0; i < cNum - 1; i++) {
            if (cPrice[i] < minPrice) {
                minPrice = cPrice[i];
            }
            result += (long) minPrice * dis[i];
        }


        System.out.println(result);







    }


}
