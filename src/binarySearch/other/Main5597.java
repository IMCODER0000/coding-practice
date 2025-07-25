package binarySearch.other;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main5597 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] students = new int[31];
        int count = 0;
        students[0] = 9999;

        for(int i =0; i<28; i++){
            int student = Integer.parseInt(br.readLine());
            students[student] = 1;
        }
//        System.out.println(students[30]);

        for(int i = 0; i<30; i++){
            if(students[i] == 0){
                System.out.println(i);
                count++;
            }
            if(count>2){
                break;
            }
        }



    }



}
