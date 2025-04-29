package javaPr.bronze1.btpractice;

import java.util.*;

public class BackPr1 {


    public static Map<Integer, List<Character>> Main = new HashMap<>();
    public static Character[] result = new Character[3];

    public static int totalCount = 0;

    public static int[] input = {2,5,9};
    public static List<String> newArr = new ArrayList<>();


    public static void BT(int index, String letter) {




        if (index >= input.length) {
            newArr.add(letter);
            totalCount++;
            return;
        }

        int num = input[index];
        List<Character> characters = Main.get(num);
        for (Character c : characters) {

            BT(index+1, letter+c);




        }


    }




    public static void main(String[] args) {


        Main.put(2, Arrays.asList('a', 'b', 'c'));
        Main.put(5, Arrays.asList('j', 'k', 'l'));
        Main.put(9, Arrays.asList('w', 'x', 'y', 'z'));


        BT(0,"");


        System.out.println(newArr);
        System.out.println("총 개수는 : " + totalCount);



    }


}
