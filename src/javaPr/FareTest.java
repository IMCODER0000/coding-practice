package javaPr;

import java.util.Scanner;

public class FareTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int usageFare = 0;
        int totalFare = 0;

        System.out.println("----Menu----------");
        System.out.println("1. 가정용 (liter당 50");
        System.out.println("2. 가정용 (liter당 40");
        System.out.println("3. 가정용 (liter당 30");
        System.out.println("--------------------");
        System.out.print("메뉴를 선택 하세요 => ");
        int menu = sc.nextInt();
        System.out.println("--------------------");
        System.out.print("사용량을 입력하세요 => ");
        int usage = sc.nextInt();
        System.out.println("=====================");

        switch (menu){
            case 1:
                usageFare = 50*usage;
                totalFare = usageFare + (usageFare / 20);
                break;
            case 2:
                usageFare = 45*usage;
                totalFare = usageFare + (usageFare / 20);
                break;
            case 3:
                usageFare = 30*usage;
                totalFare = usageFare + (usageFare / 20);
                break;

        }
        System.out.println("사용자 코드 : " + menu);
        System.out.println("사용 요금 : " + usageFare );
        System.out.println("총 수도 요금 : " + totalFare);
        System.out.println("=====================");


    }






}
