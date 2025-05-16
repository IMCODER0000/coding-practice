package binarySearch.gold2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main12015_2 {




    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> lis = new ArrayList<>();

        for (int num : arr) {
            if (lis.isEmpty() || lis.get(lis.size() - 1) < num) {
                lis.add(num);
            } else {
                int idx = Collections.binarySearch(lis, num);
                if (idx < 0) idx = -(idx + 1);
                lis.set(idx, num);
            }
        }

        System.out.println(lis.size());
    }





}







