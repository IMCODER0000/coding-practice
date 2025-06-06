package other.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main2164 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> q = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        while (q.size() != 1) {
            q.poll();
            Integer pollNum = q.poll();
            q.offer(pollNum);
        }

        System.out.println(q.poll());






    }



}
