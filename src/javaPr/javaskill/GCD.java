package javaPr.javaskill;

public class GCD {


    private static int GCD_(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a%b;
            a = b;
        }
        return b;


    }


    public static void main(String[] args){




    }



}
