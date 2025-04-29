package javaPr.javaskill;


public class ForStart1 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for(int j=5-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }





    }



}
