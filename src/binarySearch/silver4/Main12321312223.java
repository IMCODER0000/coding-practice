package binarySearch.silver4;

import java.util.Arrays;

public class Main12321312223 {




    // -10 -10 2 3 3 6 7 10 10 10
    //
    private static int LowerBS(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] >= target) {
                right = mid;
            }
            else{
                left = mid + 1;
            }



        }

        return left;




    }

    private static int UpperBs(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;


            if (arr[mid] > target) {
                right = mid;
            } else if (arr[mid] <= target) {

                left = mid + 1;

            }


        }

        return left;

    }

    // 3 6 7 10 10 10








    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        int[] sang = {6 ,3, 2, 10, 10, 10, -10, -10, 7 ,3};
        Arrays.sort(sang);


        for (int i : sang) {
            System.out.print(i + "  ");
        }
        System.out.println();


        int resultL = LowerBS(sang, 3);
        int resultU = UpperBs(sang, 3);

        System.out.println(resultU);
        System.out.println(resultL);



    }







    }







