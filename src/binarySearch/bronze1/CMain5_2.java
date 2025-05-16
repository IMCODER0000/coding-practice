package binarySearch.bronze1;

import java.util.Scanner;

public class CMain5_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inNum = scanner.nextInt();
        int startX = 0;
        int startY = 0;

        int bigX = 0;
        int bigY = 0;
        int smallX = 0;
        int smallY = 0;


        for (int i = 0; i < inNum; i++) {

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (i == 0) {
                startX = x;
                startY = y;
            }
            else{
                bigX = Math.max(startX, x);
                bigY = Math.max(startY, y);
                smallX = Math.min(startX, x);
                smallY = Math.min(startY, y);
            }

            int X = bigX - smallX;
            int Y = bigY - smallY;

            int result = X * Y;

            System.out.println(result);


        }


    }


}
