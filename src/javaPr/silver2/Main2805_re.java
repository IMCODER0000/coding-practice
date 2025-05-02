package javaPr.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main2805_re {


    private static boolean Possibility(int M, int[] trees, int H){

        int count = 0;
        for(int tree : trees){
            if(tree > H) count += tree - H;
        }
        return count>=M;

    }


    private static int MaximumH(int[] trees, int M, int max){
        int left = 0;
        int right = max;
        int result = 0;

        while(left <= right){
            int mid = (left + right) / 2;

            if (Possibility(M,trees,mid)) {
                result = mid;
                left = mid + 1;
            } else{
                right = mid - 1;
            }


        }
        return result;






    }




    public static void main(String[] args) throws Exception{
        // N - TreeCount
        // M - NeedTreeCount

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int  M = Integer.parseInt(NM[1]);

        String[] treesInput = br.readLine().split(" ");
        int[] trees = new int[treesInput.length];
        int maxTreeH = 0;

        for(int i =0; i< treesInput.length; i++){

            trees[i] = Integer.parseInt(treesInput[i]);
            maxTreeH = Math.max(maxTreeH, trees[i]);

        }

        int result = MaximumH(trees, M, maxTreeH);

        System.out.println(result);


    }


}
