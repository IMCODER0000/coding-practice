package dfs.gold3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main9466 {


    static int[] graph;
    static boolean[] visited;
    static boolean[] finished;
    static int teamCount;


    static void DFS(int node){
        visited[node] = true;
        int next = graph[node];
        if(!visited[next]){
            DFS(next);
        } else if(!finished[next]){
            for (int i = next; i != node; i = graph[i]) {
                teamCount++;
            }
            teamCount++;
        }

        finished[node] = true;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());

        for (int q = 0; q < T; q++) {
            int n = Integer.parseInt(br.readLine());
            String[] student = br.readLine().split(" ");
            graph = new int[n+1];
            finished = new boolean[n+1];
            visited = new boolean[n+1];
            teamCount = 0;
            



            for (int i = 0; i < n; i++) {
                graph[i+1] = Integer.parseInt(student[i]);
            }


            for (int i = 0; i <n; i++) {
                if (!visited[i+1]){
                    DFS(i+1);
                }
            }



            System.out.println(n - teamCount);


        }





    }


}
