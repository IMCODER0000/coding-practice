package dfs.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main11724 {

    static ArrayList<Integer>[] graph;
    static boolean[] visitedB;
    static boolean[] visitedD;
    static int countB;
    static int countD;


    static void dfs(int node){
        visitedD[node] = true;
        for (int g : graph[node]) {
            if (!visitedD[g]) {
                dfs(g);
            }
        }

    }

    static void bfs(int node){
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        visitedB[node] = true;

        while (!q.isEmpty()) {
            Integer poll = q.poll();

            for (int g : graph[poll]){

                if(!visitedB[g]){
                    q.offer(g);
                    visitedB[g] = true;
                }


            }


        }


    }




    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");

        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        graph = new ArrayList[N+1];
        visitedB = new boolean[N+1];
        visitedD = new boolean[N+1];
        countB = 0;
        countD = 0;

        for (int i = 1; i <=N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i <= M; i++) {
            String[] input = br.readLine().split(" ");
            graph[Integer.parseInt(input[0])].add(Integer.parseInt(input[1]));
            graph[Integer.parseInt(input[1])].add(Integer.parseInt(input[0]));
        }

        for (int i = 1; i <= N; i++) {
            if(!visitedD[i]){
                dfs(i);
                countD++;
            }

        }

        for (int i = 1; i <= N; i++) {
            if(!visitedB[i]){
                bfs(i);
                countB++;
            }

        }





        System.out.println(countB);
        System.out.println(countD);


    }



}
