package bfs.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main1697 {

    static int N,K;
    static int MAX = 100001;
    static boolean[] visited = new boolean[MAX];

    static int time;

    static class Point{
        int x;
        int time;
        public Point(int x, int time){
            this.x = x;
            this.time = time;
        }
    }

    static int bfs(int x){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x,time));
        visited[x] = true;

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int[] nextX = {p.x - 1, p.x + 1, p.x * 2};

            if(p.x == K){
                return p.time;
            }

            for (int i = 0; i < 3; i++) {

                if(nextX[i] < 0 || nextX[i] >= MAX || visited[nextX[i]]){
                    continue;
                }

                queue.offer(new Point(nextX[i], p.time+1));
                visited[nextX[i]] = true;
            }



        }

        return -1;


    }


    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        time = 0;
        // N 수빈이 위치
        // K 동생의 위치

        String[] NK = br.readLine().split(" ");


        N = Integer.parseInt(NK[0]);
        K = Integer.parseInt(NK[1]);

        int result = bfs(N);

        System.out.println(result);








    }



}
