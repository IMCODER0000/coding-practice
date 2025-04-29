package javaPr.silver4;

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

            if( haveCards.get(Integer.parseInt(input[i])) == null){
                haveCards.put(Integer.parseInt(input[i]), 0);
            }
            else{
                haveCards.put(Integer.parseInt(input[i]),haveCards.get(Integer.parseInt(input[i]))+1);
            }

        }


        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());

        String[] Ints = br.readLine().split(" ");

        for (int j = 0; j < Ints.length; j++) {
            int Int = Integer.parseInt(Ints[j]);
            sb.append(haveCards.get(Int) + " ");
        }

        System.out.println(sb);




















    }






}
