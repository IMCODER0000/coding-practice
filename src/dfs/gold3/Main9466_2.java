package dfs.gold3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main9466_2 {


    static int[] graph;
    static boolean[] visited;
    static boolean[] finished;
    static int teamCount;

    static void DFS(int node) {
        visited[node] = true;
        int next = graph[node];

        if (!visited[next]) {
            DFS(next);
        } else if (!finished[next]) {
            // 사이클 발견
            for (int i = next; i != node; i = graph[i]) {
                teamCount++;
            }
            teamCount++;  // 자기 자신도 포함
        }

        finished[node] = true;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());

        for (int q = 0; q < T; q++) {
            int n = Integer.parseInt(br.readLine());
            graph = new int[n + 1];
            visited = new boolean[n + 1];
            finished = new boolean[n + 1];
            teamCount = 0;

            String[] student = br.readLine().split(" ");
            for (int i = 1; i <= n; i++) {
                graph[i] = Integer.parseInt(student[i - 1]);
            }

            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    DFS(i);
                }
            }


            // 1 2 3 4 5
            // 2 3 4 5 3

            System.out.println(n - teamCount);


        }





    }


}
