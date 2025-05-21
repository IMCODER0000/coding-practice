package other.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main1427 {
    public static void main(String[] args)  throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("");
        Integer[] I = new Integer[input.length];

        for (int i = 0; i< input.length; i++) {
            I[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(I, Collections.reverseOrder());

        for (Integer i : I) {
            System.out.print(i);
        }







    }





}
