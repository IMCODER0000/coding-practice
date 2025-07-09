package dfs.silver3;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2606_3 {
    static int[] nodes;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int computerNum = Integer.parseInt(br.readLine());
        int nodeNum = Integer.parseInt(br.readLine());

        String[] noodesInput = br.readLine().split(" ");
        nodes = new int[nodeNum];
        for (int i = 0; i < nodeNum; i++) {
            nodes[i] = Integer.parseInt(noodesInput[i]);
        }





    }






}
