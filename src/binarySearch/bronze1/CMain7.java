package binarySearch.bronze1;

import java.util.Scanner;

public class CMain7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        String startTopic = "";
        StringBuilder newTopic = new StringBuilder();

        for (int i = 0; i < num; i++) {

            String Topic = scanner.next();



            if (i == 0) {
                startTopic = Topic;
            }

            else {
                newTopic = new StringBuilder();



                for (int j = 0; j < Topic.length(); j++) {
                    if (startTopic.charAt(j) == (Topic.charAt(j))) {

                        newTopic.append(startTopic.charAt(j));
                    } else {
                        newTopic.append("?");
                    }

                }

                startTopic = String.valueOf(newTopic);

            }





        }

        if(num ==1){
            System.out.println(startTopic);
        }
        else{
            System.out.println(newTopic);
        }



    }


}
