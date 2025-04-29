package javaPr.algorithm.binarySearch;


import java.util.Arrays;

// 정렬된 배열에서 중간값을 계속 기준으로 잡아 절반씩 범위를 좁혀가며 찾는 방식
public class BinarySearch {

    protected static int BS(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        //1,3,4,7,9,11,13  -9

        //2,4,6,8,10,12   -5
        // 0 - 6   mid = 3  target = 5 => 8
        // 0 - 3  mid = 1  t = 5 => 4
        // 1 - 3  mid = 2  t = 5  => 6
        // 1 - 2  mid = 1  t = 5  => 4
        // 1 - 1 mid = 1  t = 5  => 4

        while (left <= right) {
            int mid = (left+right) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid]<target) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }

        return -1;

    }


    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 5;
        int result = BS(arr, target);

        // result 는 -1 or 답
        if (result != -1) {
            System.out.println("정답은 : " + result);
        } else {
            System.out.println("정답이 없습니다");
        }


    }


}
