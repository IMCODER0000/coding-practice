package binarySearch.bronze1;


import java.util.Scanner;

public class CMain1 {


//    문제
//    한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
//
//    입력
//    첫째 줄에 x, y, w, h가 주어진다.
//
//    출력
//    첫째 줄에 문제의 정답을 출력한다.
//
//            제한
//1 ≤ w, h ≤ 1,000
//            1 ≤ x ≤ w-1
//            1 ≤ y ≤ h-1
//    x, y, w, h는 정수


    // https://www.acmicpc.net/problem/1085


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int min = calcul(x, y, w, h);



        System.out.println(min);

    }

    public static int calcul(int x, int y, int w, int h) {

        return Math.min(Math.min(x, y),Math.min(w - x, h - y));

    }


}
