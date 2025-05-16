package binarySearch.bronze1;

import java.util.*;

public class CMain11 {

    public static void main(String[] agrs) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();


        String[][] expense = new String[N][M];
        Set<Integer> xList = new HashSet<>();
        Set<Integer> yList = new HashSet<>();
        int minExpense = 0;

        for (int i = 0; i < N; i++) {
            String castle = scanner.nextLine();

            for (int j = 0; j < M; j++) {

                char ch = castle.charAt(j);
                if (ch == 'X') {
                    xList.add(i);
                    yList.add(j);
                } else if (!xList.contains(i) && !yList.contains(j)) {
                    xList.add(i);
                    yList.add(j);
                    minExpense ++;
                }


            }


        }
        System.out.println(minExpense);









//
//
//
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//
//                expense[i][j] = scanner.next();
//
//                if (expense[i][j].equals("X")) {
//                    xList.add(j);
//                    yList.add(i);
//                }
//
//                if(!xList.contains(j) && !yList.contains(i) && expense[i][j].equals(".")){
//
//
//                    xList.add(j);
//                    yList.add(i);
//                    minExpense++;
//
//                }
//
//            }
//
//
//
//
//        }
//
//        System.out.println(minExpense);










    }



}