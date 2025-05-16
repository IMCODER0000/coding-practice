package binarySearch.bronze1;


import java.util.Scanner;

public class CMain9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int cycleN = N;


        int cycleNum = 0;

        while (true) {


            int front = cycleN / 10;
            int Back = cycleN % 10;
            int newN1 = (front + Back) % 10;

            int newN = Back * 10 + newN1;

            cycleNum++;


            if (newN == N) {
                break;
            }
            else{
                cycleN = newN;

            }


        }

        System.out.println(cycleNum);





    }


}
