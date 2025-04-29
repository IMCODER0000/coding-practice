package javaPr.QWE;

import java.util.Scanner;

public class W {

    public static void main(String[] args) {

        int p = 10;
        int c = 10;
        int n = 10;

        Scanner scanner = new Scanner(System.in);



        System.out.print("음료수 입력 : ");
        String input = scanner.nextLine();

        if(input == "코카콜라"){
            System.out.println(c);
        } else if(input == "나랑드사이다"){
            System.out.println(n);
        } else{
            System.out.println(p);
        }














    }
}
