package dfs.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main1260 {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static ArrayList<Integer> dfsResult;
    static ArrayList<Integer> bfsResult;



    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        bfsResult.add(start);
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int now = q.poll();

            for (int next : graph[now]) {
                if(!visited[next]){
                    q.add(next);
                    visited[next] = true;
                    bfsResult.add(next);
                }
            }



        }

    }


    static void dfs(int start){
        visited[start] = true;
        dfsResult.add(start);
        for(int next : graph[start]){
            if(!visited[next]){
                dfs(next);
            }
        }


    }







    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dfsResult = new ArrayList<>();
        bfsResult = new ArrayList<>();

        String[] NMV = br.readLine().split(" ");

        int N = Integer.parseInt(NMV[0]);
        int M = Integer.parseInt(NMV[1]);
        int V = Integer.parseInt(NMV[2]);

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];


        for(int i = 1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            graph[a].add(b);
            graph[b].add(a);

        }


        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }




        dfs(V);
        visited = new boolean[N + 1];
        bfs(V);



        for (int i : dfsResult) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : bfsResult) {
            System.out.print(i + " ");
        }







    }



}
