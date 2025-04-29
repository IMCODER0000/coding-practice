package javaPr.bronze1;

import java.util.Scanner;

public class CMain12{

    //https://www.acmicpc.net/problem/1296

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        sc.nextLine();


        int L_ = 0;
        int O_ = 0;
        int V_ = 0;
        int E_ = 0;

        if (name.length() > 20) {
            System.out.println("이름이 너무 깁니다.");
            return;
        }

        for (int q = 0; q < name.length(); q++) {

            switch (name.charAt(q)) {
                case 'L':
                    L_++;
                    break;
                case 'O':
                    O_++;
                    break;
                case 'V' :
                    V_++;
                    break;

                case 'E' :
                    E_++;
                    break;
            }
//            switch (name.charAt(q)) {
//                case 'L' -> {
//                    L_++;
//                }
//                case 'O' -> {
//                    O_++;
//                }
//                case 'V' -> {
//                    V_++;
//                }
//                case 'E' -> {
//                    E_++;
//                }
//            }
        }

        int teamNameNum = sc.nextInt();
        sc.nextLine();
        int nameScore = 0;
        int maxScore = 0;

        int L = 0;
        int O = 0;
        int V = 0;
        int E = 0;


        String bestName = sc.nextLine();

        for (int i = 0; i < teamNameNum-1; i++) {
            String teamName = sc.nextLine();

            L = L_;
            O = O_;
            V = V_;
            E = E_;


            for (int j = 0; j < teamName.length(); j++) {


                switch(teamName.charAt(j)) {
                    case 'L':
                        L++;
                        break;
                    case 'O':
                        O++;
                        break;
                    case 'V' :
                        V++;
                        break;
                    case 'E' :
                        E++;
                        break;



//                    case 'L' -> {
//                        L++;
//                    }
//                    case 'O' -> {
//                        O++;
//                    }
//                    case 'V' -> {
//                        V++;
//                    }
//                    case 'E' -> {
//                        E++;
//                    }
                }



            }

            nameScore = ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100;

            if (nameScore > maxScore) {
                maxScore = nameScore;
                bestName = teamName;
            } else if (nameScore == maxScore) {
                if (bestName.compareTo(teamName) >= 0) {
                    bestName = teamName;
                }
            }








        }





        System.out.println(bestName);




    }


}
