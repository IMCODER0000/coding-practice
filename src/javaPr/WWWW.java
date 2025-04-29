package javaPr;

import java.util.Scanner;

public class WWWW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int powerade = 10;
        int coke = 10;
        int cider = 10;



        System.out.print("구매한 음료수: ");
        String st = sc.nextLine();

        String st2 = "파워에이드";
//        System.out.println(powerade);
//        System.out.println(st);
        System.out.println(st==st2);


        if(st == "파워에이드") {
            System.out.println("남은수량1: " + powerade + " - " + "1" + " = " + (powerade - 1)+ "개");
            System.out.println(powerade);
        }else if(st == "코카콜라") {
            System.out.println("남은수량2: " + coke + " - " + "1" + " = " + (coke - 1) + "개");
        }else {
            System.out.println("남은수량3: " + cider + " - " + "1" + " = " + (cider - 1) + "개");
        }
        System.out.println("구매 완료");
    }

}
