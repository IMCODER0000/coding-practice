package binarySearch.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3079 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N - 심사대 수
        // M - 사람 수
        // T(k) - 각 심사대의 걸리는 시간


        // 키워드 - 시간, 사람수 -> 몇초안에 몇명이 가능하냐
        // 이진탐색 ->  시간 or 사람수를 기준 // 주어진 값 => 사람수, 시간 최소  *** 사람수를 기준 (possibility - 사람 수)
        // 총 사람 수  =  총 걸린시간 / 각파트별 최대 사람 수

        String[] NM = br.readLine().split(" ");

        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        long[] NTime = new long[N];
        long maxTime = 0;

        for (int i = 0; i < N; i++) {
            NTime[i] = Long.parseLong(br.readLine());
            maxTime = Math.max(maxTime, NTime[i]);
        }

        long left = 1;
        long right = maxTime * M;
        long result = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long count = 0;
            boolean overflow = false;

            for (int i = 0; i < N; i++) {
                if (count > M) {
                    overflow = true;
                    break;

                }
                count += mid / NTime[i];
            }


            if(count>=M || overflow){
                result = mid;
                right = mid - 1;
            } else{
                left = mid + 1;
            }

        }


        System.out.println(result);








    }




}
