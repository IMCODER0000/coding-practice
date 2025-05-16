package binarySearch.bronze1;

import java.util.Scanner;

public class CMain5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inNum = scanner.nextInt();

        int[][] poin = new int[inNum][2];

        for (int i = 0; i < inNum; i++) {
            for (int j = 0; j < 2; j++){
                int i1 = scanner.nextInt();
                poin[i][j] = i1;

            }
        }

        int smallX = poin[0][0];
        int smallY = poin[0][1];
        int bigX = poin[0][0];
        int bigY = poin[0][1];

        for (int i = 0; i < inNum; i++) {
            int X = poin[i][0];
            int Y = poin[i][1];

            smallX = Math.min(X, smallX);
            bigX = Math.max(X, bigX);

            smallY = Math.min(Y, smallY);
            bigY = Math.max(Y, bigY);

        }

        int X = bigX - smallX;
        int Y = bigY - smallY;

        int result = X * Y;

        System.out.println("정답 : " + result);
















//        for (int i = 0; i < inNum; i++) {
//            for (int j = 0; j < 2; j++){
//                System.out.print(poin[i][j]);
//
//
//            }
//            System.out.println();
//
//        }





















    }


}
