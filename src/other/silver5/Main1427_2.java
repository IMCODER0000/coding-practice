package other.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main1427_2 {
    public static void main(String[] args)  throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("");
        Integer[] I = new Integer[input.length];

        for (int i = 0; i< input.length; i++) {
            I[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < I.length; i++) {
            int minI = i;
            for (int j = i+1; j < I.length; j++) {
                if(I[minI]>I[j]){
                    minI = j;
                }
            }

            int temp = I[i];
            I[i] = I[minI];
            I[minI] = temp;
        }


        System.out.println(Arrays.toString(I));

    }









    }






