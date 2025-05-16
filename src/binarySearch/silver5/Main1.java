package binarySearch.silver5;

import java.util.Scanner;

public class Main1{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);



        int testNum = s.nextInt();
        s.nextLine();

        int[] answer = new int[testNum];


        for (int i = 0; i < testNum; i++) {
            int west = s.nextInt();
            int east = s.nextInt();
            s.nextLine();

            if (west > east) {
                System.out.println("동쪽의 사이트 수가 더 많거나 같아야 합니다");
                return;
            }

            int caseNum = 1;
            int westNum = west;

            for (int j = 0; j < west; j++) {

                caseNum = caseNum * westNum;
                westNum--;

            }

            answer[i] = caseNum;


        }


        for (int q = 0; q < answer.length; q++) {
            System.out.println(answer[q]);
        }



    }


}
