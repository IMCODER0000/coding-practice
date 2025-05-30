package dfs.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main2606_2 {

    static ArrayList<Integer>[] graph;

    static boolean[] visited;

    static int count;





    static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;

        while(!q.isEmpty()){
            int poll = q.poll();
            for (int next : graph[poll]) {
                if (!visited[next]) {
                    count++;
                    visited[next] = true;
                    q.add(next);
                }
            }

        }


    }





    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cNum = Integer.parseInt(br.readLine());
        int nNum = Integer.parseInt(br.readLine());


        graph = new ArrayList[cNum + 1];
        visited = new boolean[cNum + 1];

        for (int i = 1; i <= cNum; i++) {
            graph[i] = new ArrayList<>();
        }


        for (int i = 0; i < nNum; i++) {
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            graph[a].add(b);
            graph[b].add(a);

        }

        bfs(1);
        System.out.println(count);

    }






}
