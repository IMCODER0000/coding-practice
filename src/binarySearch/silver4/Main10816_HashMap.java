package binarySearch.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main10816_HashMap {

    public static void main(String[] args) throws Exception{

        // N = Sang's Cards
        // M = int num

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        HashMap<Integer, Integer> haveCards = new HashMap<>();

        for (int i = 0; i < input.length; i++) {

            int num = Integer.parseInt(input[i]);

            haveCards.put(num, haveCards.getOrDefault(num, 0) +1);


        }


        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());

        String[] Ints = br.readLine().split(" ");

        for (int j = 0; j < Ints.length; j++) {
            int Int = Integer.parseInt(Ints[j]);
            sb.append(haveCards.getOrDefault(Int, 0)).append(" ");
        }

        System.out.println(sb.toString().trim());

    }


}
