package binarySearch.javaskill;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bufferReader {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String[] viewPath = br.readLine().split(" ");

        for (int i = 0; i < viewPath.length; i ++) {
            sb.append(viewPath[i] + " ");
        }
        System.out.println(sb);

    }



}
