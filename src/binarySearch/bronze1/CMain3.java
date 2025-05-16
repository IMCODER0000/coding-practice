package binarySearch.bronze1;

import java.util.List;

public class CMain3 {

    public static void main(String[] args) {

//        int a = 5;
//        int a1 = 7;
//        int a2 = 7;
//        int a3 = 5;
//        int a4 = 7;
//        int a5 = 5;

        int a = 1;
        int q = 2;
        int w = 3;

        int T = a ^ q;
        int T2 = a ^ w;
        int T3 = a ^ a;

        System.out.println(T);
        System.out.println(T2);
        System.out.println(T3);

        List<Integer> list = List.of(1, 2, 1, 1);

        Integer i = list.get(0);
        int b = 0;
        for (int I : list) {
            b = i ^ I;
            i = I;
        }

//        int Q = a ^ a2 ^ a4;
//        int W = a1 ^ a3 ^ a5;
//
//        System.out.println(b);
//
//        System.out.println();
//
//        System.out.println(Q);
//        System.out.println(W);



    }

}
