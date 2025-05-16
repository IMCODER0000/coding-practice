package binarySearch.gold4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main8983 {






    private static int BS(int[] M, int[][] Animals, int L){
        int count = 0;

        for (int i = 0; i < Animals.length; i++) {
            int left = 0;
            int right = M.length;
            boolean posi = false;
            if (Animals[i][1] > L) continue;

            while(left < right){
                int mid = (left + right) / 2;
                int dis = Math.abs(M[mid] - Animals[i][0]) + Animals[i][1];

                if(dis<=L){
                    posi = true;
                    break;
                }
                if(M[mid] < Animals[i][0]){
                    left = mid + 1;
                } else{
                    right = mid;
                }

            }
            if (posi) count ++;
        }

        return count;

    }



    // M - 사대의 수
    // N - 동물의 수
    // L - 사정거리
    //


    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] MNL = br.readLine().split(" ");
        int M = Integer.parseInt(MNL[0]);
        int N = Integer.parseInt(MNL[1]);
        int L = Integer.parseInt(MNL[2]);
        int[] Ms = new int[M];

        String[] MsInput = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            Ms[i] = Integer.parseInt(MsInput[i]);
        }


        int[][] AnimalsLocation = new int[N][2];
        int max = 0;


        for (int i = 0; i < N; i++) {
            String[] animalsInput = (br.readLine()).split(" ");
            AnimalsLocation[i][0] = Integer.parseInt(animalsInput[0]);
            AnimalsLocation[i][1] = Integer.parseInt(animalsInput[1]);
        }

        Arrays.sort(Ms);

        int result = BS(Ms, AnimalsLocation, L);
        System.out.println(result);


    }


}
