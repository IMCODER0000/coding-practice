package other.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main10799 {

    static int stick;

    static void goStack(String s) {
        stick = 0;
        Stack<Character> cStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '('){
                cStack.push('(');
            } else if (c == ')') {
                cStack.pop();
                if(s.charAt(i-1) == '('){
                    stick += cStack.size();
                } else{
                    stick++;
                }
            }

        }


    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        goStack(s);

        System.out.println(stick);




    }



}
